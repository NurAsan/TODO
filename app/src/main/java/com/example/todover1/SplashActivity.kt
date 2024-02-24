package com.example.todover1


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()

        val intent = Intent(this@SplashActivity, MainActivity::class.java)
        Handler().postDelayed({
            startActivity(intent)
            finish()
        }, 2000)
    }
}