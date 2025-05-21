package com.example.testui.logics

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testui.data.network.ApiService
import com.example.testui.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
class SampleViewModel @Inject constructor(
    private val api: ApiService
) : ViewModel() {

    private val _userData = MutableLiveData<String>()
    val userData: LiveData<String> = _userData

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