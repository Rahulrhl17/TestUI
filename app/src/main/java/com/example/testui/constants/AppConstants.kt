package com.example.testui.constants

object AppConstants {
    //BASE_URL_UAT
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