package com.example.testui.models

/**
 * Created by Shivani Jain on 5/28/2025.
 */
data class BillPaymentRequest(
    val RequestId: String?="",
    val MethodId: Int?=0,
    val TellerID: String?="",
    val TokenId: String?="",
    val SessionId: String?="",
    val SessionExpiryTime: String?="",
    val IsEncrypt: Boolean?=false,
    val RequestData: HashMap<String, Any>?,
    val X_Auth_Token: String?="",
    val ChannelID: String?="",
    val Version: String?="",
    val ProductCode: String?="",
    val Amount: Any?,
    val Language: String?="",
    val EncType: String?=""
)