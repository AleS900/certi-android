package com.upb.aroundme.ui.selectSession.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.upb.aroundme.R
import com.upb.aroundme.databinding.ActivitySelectSessionBinding

class SelectSessionActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySelectSessionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectSessionBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}