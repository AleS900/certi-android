package com.upb.aroundme.ui.departmentPage.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.upb.aroundme.databinding.ActivityCityListBinding

class CitiesActivity : AppCompatActivity() {

    private lateinit var binding:ActivityCityListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCityListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        }

}