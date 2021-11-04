package com.upb.aroundme.ui.login.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.upb.aroundme.databinding.FragmentLoginBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

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

            loginViewModel.login(username,password).onEach {
                val goToCitiesListDirections = LoginFragmentDirections.actionLoginFragmentToCitiesActivity()
                findNavController().navigate(goToCitiesListDirections)
            }.catch {
                val goToErrorPage = LoginFragmentDirections.actionLoginFragmentToSessionErrorActivity()
                findNavController().navigate(goToErrorPage)
            //Toast.makeText(requireContext(), "ERROR", Toast.LENGTH_SHORT).show()
            }.launchIn(CoroutineScope(Dispatchers.Main))
        }
    }
}

