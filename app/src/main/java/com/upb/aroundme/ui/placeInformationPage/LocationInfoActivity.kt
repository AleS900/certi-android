package com.upb.aroundme.ui.placeInformationPage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.navArgs
import com.upb.aroundme.databinding.ActivityLocationInfoBinding
import com.upb.aroundme.model.PlacesToVisit

class LocationInfoActivity : AppCompatActivity() {
    private lateinit var placesToVisit : PlacesToVisit
    private val args : LocationInfoActivityArgs by navArgs()
    private lateinit var binding : ActivityLocationInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocationInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        placesToVisit = args.placeInfo
        binding.atraction=placesToVisit
    }

}