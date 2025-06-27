package com.blockcanary

import android.app.Application
import android.content.Context
import androidx.startup.Initializer


internal class BlockCanaryStartupInitializer : Initializer<BlockCanaryStartupInitializer> {


    override fun create(context: Context)= apply {
        val application = context.applicationContext as Application
        
        if (false){
            val blockCanaryConfig = BlockCanaryConfig.newBuilder().build()
            BlockCanary.install(application, blockCanaryConfig)
        }
    }

    override fun dependencies()= emptyList<Class<out Initializer<*>>>()
}
