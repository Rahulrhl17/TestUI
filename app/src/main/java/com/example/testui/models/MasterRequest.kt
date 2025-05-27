package com.example.testui.models

data class MasterRequest(
    val RequestId: String,
    val TellerID: String,
    val SessionId: String,
    val TokenId: String,
    val IsEncrypt: Boolean,
    val MethodId: Int,
    val RequestData: String,
    val SessionExpiryTime: String,
    val X_Auth_Token: String,
    val Language: String
)