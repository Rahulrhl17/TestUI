package com.example.testui.ui

import android.view.LayoutInflater
import androidx.activity.viewModels
import com.example.testui.base.FinoPayActivity
import com.example.testui.databinding.ActivitySampleBinding
import com.example.testui.logics.SampleViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SampleActivity : FinoPayActivity<ActivitySampleBinding>() {

    private val sampleViewModel: SampleViewModel by viewModels()

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
}