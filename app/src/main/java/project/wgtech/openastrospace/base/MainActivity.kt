package project.wgtech.openastrospace.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import project.wgtech.openastrospace.R
import project.wgtech.openastrospace.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.simpleName

    private lateinit var b: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG, "onCreate MainActivity")

        b = DataBindingUtil.setContentView(this,
            R.layout.activity_main
        )

        b.executePendingBindings()
    }
}