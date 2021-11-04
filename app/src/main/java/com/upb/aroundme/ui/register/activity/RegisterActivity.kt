package com.upb.aroundme.ui.register.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.upb.aroundme.R
import com.upb.aroundme.ui.register.fragment.RegisterFragment

class RegisterActivity : AppCompatActivity() {
    private val registerFragment = RegisterFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }
}

