package com.upb.aroundme.ui.register.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.upb.aroundme.databinding.FragmentRegisterBinding
import com.upb.aroundme.ui.login.fragment.LoginFragmentDirections
import com.upb.aroundme.ui.register.fragment.RegisterViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach


class RegisterFragment: Fragment() {
    private lateinit var binding: FragmentRegisterBinding
    private val registerViewModel: RegisterViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegisterBinding.inflate(inflater,container,false)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.buttonNext.setOnClickListener {
            val username = binding.userID.text.toString()
            val email = binding.email.text.toString()
            val password = binding.editTextTextPassword.text.toString()

            registerViewModel.register(username,email,password).onEach {
                val goToCitiesListDirectionsRegister = RegisterFragmentDirections.actionRegisterFragmentToCitiesActivity()
                findNavController().navigate(goToCitiesListDirectionsRegister)
            }.catch {
                val goToErrorPage = RegisterFragmentDirections.actionRegisterFragmentToSessionErrorActivity2()
                findNavController().navigate(goToErrorPage)
            }.launchIn(CoroutineScope(Dispatchers.Main))


        }
    }
}

