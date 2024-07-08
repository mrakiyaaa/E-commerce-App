package com.example.e_commerceapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.e_commerceapp.data.User
import com.example.e_commerceapp.utile.Resource
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginRegisterViewModel @Inject constructor(
    private val firebaseAuth: FirebaseAuth
) : ViewModel() {

    private val _register = MutableStateFlow<Resource<FirebaseUser>>(Resource.Loading())
    val register: StateFlow<Resource<FirebaseUser>> get() = _register

    fun createAccountWithEmailPassword(user: User, password: String) {
        _register.value = Resource.Loading()
        firebaseAuth.createUserWithEmailAndPassword(user.email, password)
            .addOnSuccessListener {
                it.user?.let { firebaseUser ->
                    _register.value = Resource.Success(firebaseUser)
                } ?: run {
                    _register.value = Resource.Error("User registration failed")
                }
            }
            .addOnFailureListener {
                _register.value = Resource.Error(it.message ?: "Unknown error")
            }
    }
}
