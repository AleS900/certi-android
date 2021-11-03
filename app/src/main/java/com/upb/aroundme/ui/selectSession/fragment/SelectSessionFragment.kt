package com.upb.aroundme.ui.selectSession.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.upb.aroundme.databinding.FragmentSelectSessionBinding

class SelectSessionFragment:Fragment() {

    private lateinit var binding: FragmentSelectSessionBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSelectSessionBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonLogin.setOnClickListener {
            val goToLoginPage=  SelectSessionFragmentDirections.actionSelectSessionFragmentToLoginActivity()
            findNavController().navigate(goToLoginPage)
        }
        binding.buttonRegister.setOnClickListener {
            val goToRegisterPage= SelectSessionFragmentDirections.actionSelectSessionFragmentToRegisterActivity()
            findNavController().navigate(goToRegisterPage)
        }
    }
}