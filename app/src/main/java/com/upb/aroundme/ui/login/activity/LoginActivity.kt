package com.upb.aroundme.ui.login.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.upb.aroundme.R
import com.upb.aroundme.ui.login.fragment.LoginFragment

class LoginActivity : AppCompatActivity() {
    private val loginFragment = LoginFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }
}