package com.example.testui.models

/**
 * Created by Shivani Jain on 27/5/2025.
 */
data class VkycRequest(val MethodId: Int,
                      val IsEncrypt: Boolean=false,
                      val RequestId: String?="",
                      val SessionExpiryTime: String?="",
                      val RequestData: HashMap<String, Any>?,
                      val TokenId: String?="",
                      val X_Auth_Token: String?="",
                      val TellerID:String?="",
                      val ProductCode:String?="",
                      val Version:String?="",
                      val SessionId:String?="",
                      val ChannelID:String?=""

)