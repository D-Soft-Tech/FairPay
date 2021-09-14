package com.example.fairpay.views.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ChangePasswordScreenViewModel : ViewModel() {
    private var newPassword: MutableLiveData<String> = MutableLiveData<String>()
    val newPass2: LiveData<String> get() = newPassword

    private var _confirmPassword: MutableLiveData<String> = MutableLiveData<String>()
    val confirmPassword: LiveData<String> get() = _confirmPassword

    fun setNewPassword(newPswd: String) {
        newPassword.value = newPswd
    }

    fun setConfirmPassword(confirmPassword: String) {
        _confirmPassword.value = confirmPassword
    }

    fun passwordMatch() = newPassword == _confirmPassword
}
