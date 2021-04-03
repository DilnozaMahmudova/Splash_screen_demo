package uz.dilnoza.mobiuz.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.dilnoza.mobiuz.R
import java.util.concurrent.Executors

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Executors.newSingleThreadExecutor().execute {
            Thread.sleep(2000)
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}