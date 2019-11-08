package com.hai.yun.daggertest

import android.app.Application
import javax.inject.Inject

class myApplication : Application() {
    val appComponent = DaggerApplicationGraph.create()
    override fun onCreate() {
        super.onCreate()
    }
}

