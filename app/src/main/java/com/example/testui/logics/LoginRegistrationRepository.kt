package com.example.testui.logics

import com.example.testui.data.network.ApiService
import com.example.testui.models.ProcessSecurityRequest
import com.example.testui.models.ApiResponse
import com.example.testui.models.BillPaymentRequest
import com.example.testui.models.MasterRequest
import com.example.testui.models.RegistrationRequest
import com.example.testui.models.SimBindingRequest
import com.example.testui.models.UtilityRequest
import com.example.testui.models.VkycRequest
import com.example.testui.utils.Resource
import javax.inject.Inject
/**
 * Created by Shivani Jain on 27/5/2025.
 */
class LoginRegistrationRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun processSecurityRequest(processSecurityRequest: ProcessSecurityRequest): Resource<ApiResponse> {
        return try {
            val response = apiService.processSecurityRequest(processSecurityRequest)
            if (response.isSuccessful && response.body() != null) {
                Resource.Success(response.body()!!)
            } else {
                Resource.Error("Error: ${response.code()} ${response.message()}")
            }
        } catch (e: Exception) {
            Resource.Error("Exception: ${e.message}")
        }
    }

    suspend fun vkycService(apiRequest: VkycRequest): Resource<ApiResponse> {
        return try {
            val response = apiService.vkycService(apiRequest)
            if (response.isSuccessful && response.body() != null) {
                Resource.Success(response.body()!!)
            } else {
                Resource.Error("Error: ${response.code()} ${response.message()}")
            }
        } catch (e: Exception) {
            Resource.Error("Exception: ${e.message}")
        }
    }

    suspend fun vkycMaster(apiRequest: MasterRequest): Resource<ApiResponse> {
        return try {
            val response = apiService.vkycMaster(apiRequest)
            if (response.isSuccessful && response.body() != null) {
                Resource.Success(response.body()!!)
            } else {
                Resource.Error("Error: ${response.code()} ${response.message()}")
            }
        } catch (e: Exception) {
            Resource.Error("Exception: ${e.message}")
        }
    }
    suspend fun simBinding(apiRequest: VkycRequest): Resource<ApiResponse> {
        return try {
            val response = apiService.simBinding(apiRequest)
            if (response.isSuccessful && response.body() != null) {
                Resource.Success(response.body()!!)
            } else {
                Resource.Error("Error: ${response.code()} ${response.message()}")
            }
        } catch (e: Exception) {
            Resource.Error("Exception: ${e.message}")
        }
    }
    suspend fun utility(apiRequest: UtilityRequest): Resource<ApiResponse> {
        return try {
            val response = apiService.utility(apiRequest)
            if (response.isSuccessful && response.body() != null) {
                Resource.Success(response.body()!!)
            } else {
                Resource.Error("Error: ${response.code()} ${response.message()}")
            }
        } catch (e: Exception) {
            Resource.Error("Exception: ${e.message}")
        }
    }
    suspend fun billPayment(apiRequest: BillPaymentRequest): Resource<ApiResponse> {
        return try {
            val response = apiService.billPayment(apiRequest)
            if (response.isSuccessful && response.body() != null) {
                Resource.Success(response.body()!!)
            } else {
                Resource.Error("Error: ${response.code()} ${response.message()}")
            }
        } catch (e: Exception) {
            Resource.Error("Exception: ${e.message}")
        }
    }

    suspend fun upiProcess(apiRequest: BillPaymentRequest): Resource<ApiResponse> {
        return try {
            val response = apiService.upiProcess(apiRequest)
            if (response.isSuccessful && response.body() != null) {
                Resource.Success(response.body()!!)
            } else {
                Resource.Error("Error: ${response.code()} ${response.message()}")
            }
        } catch (e: Exception) {
            Resource.Error("Exception: ${e.message}")
        }
    }

    suspend fun Registration(apiRequest: RegistrationRequest): Resource<ApiResponse> {
        return try {
            val response = apiService.registration(apiRequest)
            if (response.isSuccessful && response.body() != null) {
                Resource.Success(response.body()!!)
            } else {
                Resource.Error("Error: ${response.code()} ${response.message()}")
            }
        } catch (e: Exception) {
            Resource.Error("Registration Exception : ${e.message}")
        }
    }


}