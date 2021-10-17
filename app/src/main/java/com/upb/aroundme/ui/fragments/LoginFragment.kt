package com.upb.aroundme.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.upb.aroundme.R
import com.upb.aroundme.databinding.FragmentLoginBinding
import com.upb.aroundme.ui.base.StepBaseFragment

class LoginFragment: StepBaseFragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.buttonNext.setOnClickListener {
            val goToCitiesListDirections = LoginFragmentDirections.actionLoginFragmentToCitiesActivity()
            findNavController().navigate(goToCitiesListDirections)
        }
    }
}

