package com.example.testui.data.network

import com.example.testui.constants.AppConstants.MASTER
import com.example.testui.constants.AppConstants.PROCESS_SECURITY_REQUEST
import com.example.testui.constants.AppConstants.REGISTRATION
import com.example.testui.constants.AppConstants.VKYC_SERVICE
import com.example.testui.models.ProcessSecurityRequest
import com.example.testui.models.ApiResponse
import com.example.testui.models.MasterRequest
import com.example.testui.models.RegistrationRequest
import com.example.testui.models.VkycRequest
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
        @POST(PROCESS_SECURITY_REQUEST)
        suspend fun processSecurityRequest(@Body processSecurityRequestWrapper: ProcessSecurityRequest): Response<ApiResponse>

        @POST(VKYC_SERVICE)
        suspend fun vkycService(@Body vkycRequest: VkycRequest): Response<ApiResponse>

        @POST(MASTER)
        suspend fun vkycMaster(@Body masterRequest: MasterRequest): Response<ApiResponse>

        @POST(REGISTRATION)
        suspend fun registration(@Body registrationRequest: RegistrationRequest) : Response<ApiResponse>

}