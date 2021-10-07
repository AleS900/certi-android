package com.upb.aroundme.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.upb.aroundme.R
import com.upb.aroundme.ui.base.StepBaseFragment

class LoginFragment: StepBaseFragment() {
    lateinit var button_next: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_login,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        button_next = view.findViewById(R.id.button_next)
        button_next.setOnClickListener {
            val goToCitiesListDirections = LoginFragmentDirections.actionLoginFragmentToCitiesActivity()
            findNavController().navigate(goToCitiesListDirections)
        }
    }
}

