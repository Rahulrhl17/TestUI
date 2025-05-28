package com.example.testui.models
/**
 * Created by Shivani Jain on 27/5/2025.
 */
data class MasterRequest(
    val RequestId: String?="",
    val TellerID: String?="",
    val SessionId: String?="",
    val TokenId: String?="",
    val IsEncrypt: Boolean?=false,
    val MethodId: Int?=0,
    val RequestData: String?="",
    val SessionExpiryTime: String?="",
    val X_Auth_Token: String?="",
    val Language: String?=""
)