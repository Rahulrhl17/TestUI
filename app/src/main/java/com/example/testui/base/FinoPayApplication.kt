package com.example.testui.base

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class FinoPayApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}