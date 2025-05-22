package com.example.testui.logics

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SampleViewModel @Inject constructor() : ViewModel() {

    val email = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    private val _userData = MutableLiveData<String>()
    val userData: LiveData<String> = _userData

    fun onButtonClick() {
        Log.d("hai", "${email.value} === ${password.value}")
    }

//    fun fetchUser() {
//        viewModelScope.launch {
//            _userData.value = Resource.Loading()
//            try {
//                val response = api.getUsers()
//                if (response.isSuccessful) {
//                    _userData.value = Resource.Success(response.body()!!)
//                } else {
//                    _userData.value = Resource.Error("API Error")
//                }
//            } catch (e: Exception) {
//                _userData.value = Resource.Error("Network error: ${e.localizedMessage}")
//            }
//        }
//    }
}