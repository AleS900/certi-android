package com.upb.aroundme.ui.interfaces

import com.upb.aroundme.model.LaPazPlace

interface LaPazInfoCallback {
    fun onTaskCityClicked(task: LaPazPlace)
}