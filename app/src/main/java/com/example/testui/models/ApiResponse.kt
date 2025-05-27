package com.example.testui.models

data class ApiResponse(
    val RequestId: String?,
    val DisplayMessage: String?,
    val ResponseMessage: String?,
    val ResponseCode: String?,
    val MessageType: String?,
    val ResponseData: Any?,
    val MessageId: String?,
    val SessionExpiryTime: String?,
    val SessionId: String?,
    val RouteID: String?,
    val ErrorCode: Int?
)