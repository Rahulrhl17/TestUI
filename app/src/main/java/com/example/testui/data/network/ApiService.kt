package com.example.testui.data.network

import com.example.testui.constants.AppConstants.BILL_PAYMENT
import com.example.testui.constants.AppConstants.MASTER
import com.example.testui.constants.AppConstants.PROCESS_SECURITY_REQUEST
import com.example.testui.constants.AppConstants.SIM_BINDING
import com.example.testui.constants.AppConstants.UPI_PROCESS
import com.example.testui.constants.AppConstants.UTILITY
import com.example.testui.constants.AppConstants.VKYC_SERVICE
import com.example.testui.models.ProcessSecurityRequest
import com.example.testui.models.ApiResponse
import com.example.testui.models.BillPaymentRequest
import com.example.testui.models.MasterRequest
import com.example.testui.models.UtilityRequest
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

        @POST(SIM_BINDING)
        suspend fun simBinding(@Body vkycRequest: VkycRequest): Response<ApiResponse>

        @POST(UTILITY)
        suspend fun utility(@Body utilityRequest: UtilityRequest): Response<ApiResponse>

        @POST(BILL_PAYMENT)
        suspend fun billPayment(@Body billPaymentRequest: BillPaymentRequest): Response<ApiResponse>

        @POST(UPI_PROCESS)
        suspend fun upiProcess(@Body billPaymentRequest: BillPaymentRequest): Response<ApiResponse>
}