package com.aayush.shoppinglistapp.common.extensions

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

fun <VH: RecyclerView.ViewHolder, T: RecyclerView.Adapter<VH>>RecyclerView.setRV(
    context: Context, adapter: T,
    linearLayoutManager: LinearLayoutManager = LinearLayoutManager(context)) {

    this.layoutManager = linearLayoutManager
    this.adapter = adapter
}