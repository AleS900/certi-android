package com.upb.aroundme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.upb.aroundme.ui.LoginFragment

class LoginActivity : AppCompatActivity() {
    val loginFragment = LoginFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        replaceFragment(R.id.frame_login,loginFragment)

        loginFragment.setOnSuccessListener{
            val intent = Intent(this, CitiesActivity()::class.java)
            startActivity(intent)
            finish()
        }
    }
}