package com.aayush.shoppinglistapp.common.utils

import android.content.Context
import android.widget.Toast

class ToastUtil {

    companion object {
        fun showToast(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }
    }
}