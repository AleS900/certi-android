package com.upb.aroundme.ui.login.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.upb.aroundme.databinding.FragmentLoginBinding

class LoginFragment: Fragment() {
    private lateinit var binding: FragmentLoginBinding
    private val loginViewModel: LoginViewModel by viewModels()

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
            val username = binding.email.text.toString()
            val password = binding.editTextTextPassword.text.toString()

            loginViewModel.login(username,password)
                .catch{
                    val goToError = LoginFragmentDirections.actionLoginFragmentToSessionErrorActivity()
                    findNavController().navigate(goToError)
                }
                .invokeOnCompletion {
                val goToCitiesListDirections = LoginFragmentDirections.actionLoginFragmentToCitiesActivity()
                findNavController().navigate(goToCitiesListDirections)
            }


        }
    }
}

