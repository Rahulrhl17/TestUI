package com.example.testui.base

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.viewbinding.ViewBinding
import com.example.testui.utils.Resource

abstract class FinoPayActivity<VB : ViewBinding> : AppCompatActivity() {

    private var _binding: VB? = null
    protected val binding get() = _binding!!


    protected abstract fun inflateBinding(layoutInflater: LayoutInflater): VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = inflateBinding(layoutInflater)
        setContentView(binding.root)
        setupViews()
        setupObservers()
    }

    protected open fun setupViews() {}
    protected open fun setupObservers() {}

    //Loading logic
    fun showLoading(isLoading: Boolean) {
    }

    //Toast Message
    fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    //Observer for NetworkResult
    open fun <T> observeResource(
        liveData: LiveData<Resource<T>>,
        onSuccess: (T) -> Unit
    ) {
        liveData.observe(this) { resource ->
            when (resource) {
                is Resource.Loading -> {
                    showLoading(true)
                }

                is Resource.Success -> {
                    showLoading(false)
                    resource.data?.let(onSuccess)
                }

                is Resource.Error -> {
                    showLoading(false)
                    showError(resource.message ?: "Something went wrong")
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null // Avoid memory leaks
    }

}