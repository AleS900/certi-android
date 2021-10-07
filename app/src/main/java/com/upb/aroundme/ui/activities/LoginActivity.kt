package com.upb.aroundme.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.upb.aroundme.R
import com.upb.aroundme.ui.fragments.LoginFragment

class LoginActivity : AppCompatActivity() {
    private val loginFragment = LoginFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }
}