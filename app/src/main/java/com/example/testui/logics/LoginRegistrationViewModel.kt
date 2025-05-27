package com.example.testui.logics

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testui.models.ProcessSecurityRequest
import com.example.testui.models.ApiResponse
import com.example.testui.models.MasterRequest
import com.example.testui.models.VkycRequest
import com.example.testui.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginRegistrationViewModel @Inject constructor(private val repository: LoginRegistrationRepository) : ViewModel()  {

    private val _securityResponse = MutableLiveData<Resource<ApiResponse>>()
    val securityResponse: LiveData<Resource<ApiResponse>> = _securityResponse


    fun processSecurityRequest(processSecurityRequest: ProcessSecurityRequest) {
        viewModelScope.launch {
            _securityResponse.postValue(Resource.Loading())
            try {
                val result = repository.processSecurityRequest(processSecurityRequest)
                _securityResponse.postValue(result)
            } catch (e: Exception) {

                _securityResponse.postValue(Resource.Error("ViewModel Exception: ${e.message}"))
            }
        }
    }
    fun vkycServiceRequest(apiRequest: VkycRequest) {
        viewModelScope.launch {
            _securityResponse.postValue(Resource.Loading())
            try {
                val result = repository.vkycService(apiRequest)
                _securityResponse.postValue(result)
            } catch (e: Exception) {

                _securityResponse.postValue(Resource.Error("ViewModel Exception: ${e.message}"))
            }
        }
    }

    fun vkycMaster(apiRequest: MasterRequest) {
        viewModelScope.launch {
            _securityResponse.postValue(Resource.Loading())
            try {
                val result = repository.vkycMaster(apiRequest)
                _securityResponse.postValue(result)
            } catch (e: Exception) {

                _securityResponse.postValue(Resource.Error("ViewModel Exception: ${e.message}"))
            }
        }
    }
}