package com.upb.aroundme.ui

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("srcUrl")
fun setImageSrcUrl(imageView: ImageView, url: String?) {
    if (url != null)
        Glide.with(imageView)
            .load(url)
            .into(imageView)
}
