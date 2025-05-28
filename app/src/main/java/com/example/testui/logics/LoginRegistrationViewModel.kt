package com.example.testui.logics

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testui.models.ProcessSecurityRequest
import com.example.testui.models.ApiResponse
import com.example.testui.models.MasterRequest
import com.example.testui.models.RegistrationRequest
import com.example.testui.models.SimBindingRequest
import com.example.testui.models.VkycRequest
import com.example.testui.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginRegistrationViewModel @Inject constructor(private val repository: LoginRegistrationRepository) :
    ViewModel() {

    private val _apiResponse = MutableLiveData<Resource<ApiResponse>>()
    val apiResponse: LiveData<Resource<ApiResponse>> = _apiResponse


    fun processSecurityRequest(processSecurityRequest: ProcessSecurityRequest) {
        viewModelScope.launch {
            _apiResponse.postValue(Resource.Loading())
            try {
                val result = repository.processSecurityRequest(processSecurityRequest)
                _apiResponse.postValue(result)
            } catch (e: Exception) {

                _apiResponse.postValue(Resource.Error("ViewModel Exception: ${e.message}"))
            }
        }
    }

    fun vkycServiceRequest(apiRequest: VkycRequest) {
        viewModelScope.launch {
            _apiResponse.postValue(Resource.Loading())
            try {
                val result = repository.vkycService(apiRequest)
                _apiResponse.postValue(result)
            } catch (e: Exception) {

                _apiResponse.postValue(Resource.Error("ViewModel Exception: ${e.message}"))
            }
        }
    }

    fun vkycMaster(apiRequest: MasterRequest) {
        viewModelScope.launch {
            _apiResponse.postValue(Resource.Loading())
            try {
                val result = repository.vkycMaster(apiRequest)
                _apiResponse.postValue(result)
            } catch (e: Exception) {

                _apiResponse.postValue(Resource.Error("ViewModel Exception: ${e.message}"))
            }
        }
    }

    fun Registration(apiRequest: RegistrationRequest) {
        viewModelScope.launch {
            _apiResponse.postValue(Resource.Loading())
            try {
                val result = repository.Registration(apiRequest)
                _apiResponse.postValue(result)
            } catch (e: Exception) {
                _apiResponse.postValue(Resource.Error("ViewModel Exception : ${e.message}"))
            }
        }
    }

    fun simBinding(apiRequest: SimBindingRequest) {
        viewModelScope.launch {
            _apiResponse.postValue(Resource.Loading())
            try {
                val result = repository.simBinding(apiRequest)
                _apiResponse.postValue(result)
            } catch (e: Exception) {
                _apiResponse.postValue(Resource.Error("ViewModel Exception : ${e.message}"))
            }
        }
    }
}