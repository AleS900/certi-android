package com.upb.aroundme.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.upb.aroundme.R
import com.upb.aroundme.StepBaseFragment

class LoginFragment: StepBaseFragment() {
    lateinit var bttn_login: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_login,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        bttn_login=view.findViewById(R.id.button_next)
        bttn_login.setOnClickListener{
            onSuccess?.invoke()
        }
    }
}