package pl.droidsonroids.crashlytics.test

import android.app.Application
import com.crashlytics.android.core.CrashlyticsCore
import io.fabric.sdk.android.Fabric

class CrashlyticsApplication : Application(){
    override fun onCreate() {
        val crashlyticsCore = CrashlyticsCore.Builder().disabled(BuildConfig.DEBUG).build()
        Fabric.with(this, crashlyticsCore)
        super.onCreate()
    }
}
