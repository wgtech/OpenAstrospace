package project.wgtech.openastrospace.base

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import project.wgtech.openastrospace.R
import project.wgtech.openastrospace.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private val TAG = SplashActivity::class.simpleName

    private lateinit var b: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Hello Splash")

        b = DataBindingUtil.setContentView(this,
            R.layout.activity_splash
        )

        b.splashTv.setText("Hello Splash!")
        b.executePendingBindings()

        var intent: Intent? = Intent(this, MainActivity::class.java)
        startActivity(intent)

        finish()
    }
}