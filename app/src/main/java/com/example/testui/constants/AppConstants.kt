package com.example.testui.constants

object AppConstants {

    //BASE_URLS
    const val BASE_URL = "http://103.1.112.205:8018"

    //SHARED_PREF
    const val PREFS_NAME = "fino_sp"

    //ENDPOINTS
    const val PROCESS_SECURITY_REQUEST="/CAUIService/NewUIServices/PaymentBankMobile.WebUI.Security/UISecurityService.svc/ProcessSecurityRequest"
    const val VKYC_SERVICE="/CAVKYServiceUIService/VKYCServiceUIService.svc/VKYCService"
    const val MASTER="/CAUIservice/UIservice.svc/VKYCMaster"
    const val SIM_BINDING="/CASimBindingUIService/SimBindingUIService.svc/SimBinding"
    const val UTILITY="/CAUIservice/UIservice.svc/Utility"
    const val BILL_PAYMENT="/CAUIservice/UIservice.svc/BillPayment"
    const val UPI_PROCESS="/PBUPISwitchSandBoxUIService/UPISwitchSandBoxUIService.svc/UPIProcessRequest"
    const val REGISTRATION = "/CAUIservice/UIservice.svc/Registration"

    //METHOD_ID

    const val PROCESS_SECURITY_REQUEST_METHOD_ID = 1
    const val MASTER_VERSION_CHECK_METHOD_ID = 7004
    const val MOBILE_TAB_CONTROLS_METHOD_ID = 7011
    const val MASTER_METHOD_ID = 1803
    const val GENERATE_AND_SEND_MOBILE_OTP_METHOD_ID = 7005
    const val VERIFY_MOBILE_OTP_METHOD_ID = 7018
    const val EMAIL_DEDUPLICATION_METHOD_ID = 7041
    const val GENERATE_AND_SEND_EMAIL_OTP_METHOD_ID = 7017
    const val VERIFY_EMAIL_OTP_METHOD_ID = 7018
    const val AADHAAR_DEDUPLICATION_METHOD_ID = 7007
    const val PAN_DEDUPLICATION_METHOD_ID = 7010
    const val SEND_AND_VERIFY_AADHAAR_OTP_METHOD_ID = 7013
    const val NSDL_PAN_VERIFICATION_METHOD_ID = 7039
    const val PINCODE_VALIDATION_METHOD_ID = 7008
    const val REGISTER_PSP_WITH_DEVICE_METHOD_ID = 1996
    const val SILENT_SMS_TOKEN_GENERATION_METHOD_ID = 1995
    const val SILENT_SMS_VERIFY_METHOD_ID = 2188
    const val DEVICE_REGISTRATION_METHOD_ID = 2189
    const val USER_DUPLICATION_CHECK_METHOD_ID = 1207
    const val EKYC_REGISTRATION_METHOD_ID = 7034
    const val SAVE_SECURITY_QUESTIONS_AND_MPIN_METHOD_ID = 1217
    //const val EN_LOGIN_METHOD_ID =

    //REQUEST_DATA_KEYS
    const val NEW_TPIN = "newTpin"
    const val CUSTOMER_NUMBER = "customerNumber"
    const val MPIN_FLAG = "mpinFlag"
    const val OLD_TPIN = "oldTpin"
    const val ENCRYPTOR_ID = "encryptorId"
    const val TPIN_FLAG = "tpinFlag"
    const val NEW_MPIN = "newMpin"
    const val OLD_MPIN = "oldMpin"

}