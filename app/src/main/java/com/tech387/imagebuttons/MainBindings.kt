package com.tech387.imagebuttons

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.tech387.imagebuttons.MainConstants.TYPE_BR_LIGHTS
import com.tech387.imagebuttons.MainConstants.TYPE_DOORS
import com.tech387.imagebuttons.MainConstants.TYPE_RIMS

object MainBindings {

    @JvmStatic
    @BindingAdapter("app:loadDrawableImage")
    fun ImageView.loadDrawableImage(drawable: Int) {
        Glide.with(context)
            .load(drawable)
            .into(this)
    }

    @JvmStatic
    @BindingAdapter("app:carPart")
    fun TextView.carPart(type: String) {
        text = when (type) {
            TYPE_RIMS -> {
                "Rims"
            }
            TYPE_DOORS -> {
                "Doors"
            }
            TYPE_BR_LIGHTS -> {
                "Breaking Lights"
            }
            else -> ""
        }
    }

}