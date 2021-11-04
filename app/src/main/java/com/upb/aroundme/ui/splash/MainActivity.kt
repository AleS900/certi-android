package com.upb.aroundme.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.upb.aroundme.R
import com.upb.aroundme.ui.login.activity.LoginActivity
import com.upb.aroundme.ui.selectSession.activity.SelectSessionActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed( {
            val intent  =  Intent(this, SelectSessionActivity::class.java)
            startActivity(intent)
            finish()
        },3000 )
    }
}