package com.upb.aroundme.ui.sessionError

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.upb.aroundme.R
import com.upb.aroundme.databinding.ActivitySessionErrorBinding
import com.upb.aroundme.ui.selectSession.activity.SelectSessionActivity

class SessionErrorActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySessionErrorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySessionErrorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonRegister.setOnClickListener {
            val intent  =  Intent(this, SelectSessionActivity::class.java)
            startActivity(intent)
            finish()

        }

    }
}