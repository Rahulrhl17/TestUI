package com.example.testui.models

data class SimBindingRequest(
    val ProductCode: String,
    val X_Auth_Token: String,
    val SessionId: String,
    val IsEncrypt: Boolean,
    val ChannelID: String,
    val TellerID: String,
    val RequestId: String,
    val SessionExpiryTime: String,
    val Version: String,
    val TokenId: String,
    val RequestData: HashMap<String, Any>?,
    val MethodId: String,
)
