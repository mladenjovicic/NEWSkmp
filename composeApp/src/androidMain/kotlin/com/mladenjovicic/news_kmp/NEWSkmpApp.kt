package com.mladenjovicic.news_kmp

import android.app.Application
import com.mladenjovicic.news_kmp.di.viewModelsModule
import di.sharedKoinModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class NEWSkmpApp:Application() {
    override fun onCreate(){
        super.onCreate()
        initKoin()
    }

    private fun initKoin(){
        val modules = sharedKoinModules + viewModelsModule

        startKoin {
            androidContext(this@NEWSkmpApp)
            modules(modules)
        }
    }

}