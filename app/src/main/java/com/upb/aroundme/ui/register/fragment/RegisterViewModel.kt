package com.upb.aroundme.ui.register.fragment

import androidx.lifecycle.ViewModel
import com.upb.aroundme.data.user.UserRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.launchIn
import org.koin.java.KoinJavaComponent.inject

class RegisterViewModel: ViewModel() {
    private val userRepository by inject(UserRepository::class.java)

    fun register(username:String ,email:String ,password:String): Job {
        return userRepository.register(username,email,password)
            .launchIn(CoroutineScope(Dispatchers.Main))
    }

}