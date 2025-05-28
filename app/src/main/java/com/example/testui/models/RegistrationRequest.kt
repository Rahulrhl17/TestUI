package com.example.testui.models

data class RegistrationRequest(
    val SessionId: String? = "",
    val TokenId: String? = "",
    val ProductCode: String? = "",
    val SessionExpiryTime: String?= "",
    val IsEncrypt: Boolean = false,
    val MethodId: Int,
    val X_Auth_Token: String? = "",
    val Version: String? = "",
    val ChannelID: String? = "",
    val TellerID: String? = "",
    val RequestId: String? = "",
    val RequestData : HashMap<String, Any>?
)
