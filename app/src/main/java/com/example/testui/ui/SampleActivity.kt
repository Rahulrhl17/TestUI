package com.example.testui.ui

import android.view.LayoutInflater
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.testui.R
import com.example.testui.base.FinoPayActivity
import com.example.testui.databinding.ActivitySampleBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SampleActivity : FinoPayActivity<ActivitySampleBinding>() {

    override fun inflateBinding(layoutInflater: LayoutInflater): ActivitySampleBinding {
        return ActivitySampleBinding.inflate(layoutInflater)
    }

    override fun setupViews() {

        binding.textViewTitle.text = "Hello World"

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun setupObservers() {

    }
}