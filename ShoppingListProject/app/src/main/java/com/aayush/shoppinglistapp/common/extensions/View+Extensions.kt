package com.aayush.shoppinglistapp.common.extensions

import android.view.View

fun View.setViewVisibility(isVisible: Boolean) {
    this.visibility = if(isVisible) View.VISIBLE else View.GONE
}