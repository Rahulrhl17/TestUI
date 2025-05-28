package com.example.testui.models

/**
 * Created by Shivani Jain on 5/28/2025.
 */
data class UtilityRequest(
    val RequestId: String?="",
    val MethodId: Int?=0,
    val TellerID: String?="",
    val TokenId: String?="",
    val SessionId: String?="",
    val SessionExpiryTime: String?="",
    val IsEncrypt: Boolean?=false,
    val OtpParam: Map<String, Any>?,
    val X_Auth_Token: String?="",
    val ChannelID: String?="",
    val Version: String?="",
    val ProductCode: String?="",
    val MessageId: Int?=0,
    val CustomerMobileNo: String?=""
)