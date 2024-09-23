package com.example.prkt3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {

    private val _name = MutableLiveData<String>()
    val name: LiveData<String> get() = _name

    private val _email = MutableLiveData<String>()
    val email: LiveData<String> get() = _email

    fun setUserInfo(name: String, email: String) {
        _name.value = name
        _email.value = email
    }
}
