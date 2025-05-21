package com.example.testui.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.testui.base.FinoPayFragment
import com.example.testui.databinding.FragmentSampleBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SampleFragment : FinoPayFragment<FragmentSampleBinding>() {


    override fun inflateBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentSampleBinding {
        return FragmentSampleBinding.inflate(inflater, container, false)
    }

    override fun setupViews() {
//        binding.root.background
    }

    override fun setupObservers() {

    }
}
