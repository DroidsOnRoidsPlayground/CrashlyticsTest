package pl.droidsonroids.crashlytics.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.crashlytics.android.Crashlytics

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            Crashlytics.getInstance().crash()
        }, 6000)
    }
}
