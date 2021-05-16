package com.aayush.shoppinglistapp.utils

import android.content.Context
import android.widget.Toast
import androidx.core.view.GravityCompat

class ToastUtil {

    companion object {
        fun showToast(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }
    }
}