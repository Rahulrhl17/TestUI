package com.example.testui.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.testui.base.FinoPayActivity
import com.example.testui.databinding.ActivitySampleBinding
import com.example.testui.logics.LoginRegistrationViewModel
import com.example.testui.logics.SampleViewModel
import com.example.testui.models.VkycRequest
import com.example.testui.utils.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SampleActivity : FinoPayActivity<ActivitySampleBinding>() {

    private val sampleViewModel: SampleViewModel by viewModels()
    private val loginRegistrationViewModel: LoginRegistrationViewModel by viewModels()

    override fun inflateBinding(layoutInflater: LayoutInflater): ActivitySampleBinding {

        return ActivitySampleBinding.inflate(layoutInflater)
    }

    override fun setupViews() {
        binding.lifecycleOwner = this

        binding.title = "Hello World"
        binding.viewModel = sampleViewModel
    }

    override fun setupObservers() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        apiCall()
    }

    fun apiCall()
    {
        val requestData = HashMap<String, Any>()
        requestData["ekyc"] = "3"
        requestData["ChannelID"] = "3"
        requestData["Ip_Address"] = ""
        requestData["productType"] = "1110"
        requestData["AppID"] = "MB"
        val request = VkycRequest(MethodId = 7027, RequestData =requestData)
        loginRegistrationViewModel.vkycServiceRequest(request)

        loginRegistrationViewModel.apiResponse.observe(this, Observer { resource ->
            when (resource) {
                is Resource.Success -> {

                    Log.d("YourActivity", "API Success: ${resource.data?.ResponseMessage}")

                    Toast.makeText(this, "Request Successful!", Toast.LENGTH_SHORT).show()
                }
                is Resource.Error -> {

                    Log.e("YourActivity", "API Error: ${resource.message}")
                    Toast.makeText(this, "Error: ${resource.message}", Toast.LENGTH_LONG).show()
                    // Optionally, you could show a retry button or a more user-friendly error dialog
                }
                is Resource.Loading -> {

                    Log.d("YourActivity", "API Loading...")
                }

            }
        })
    }
}