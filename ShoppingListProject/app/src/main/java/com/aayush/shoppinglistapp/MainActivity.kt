package com.aayush.shoppinglistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aayush.shoppinglistapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _viewBinding: ActivityMainBinding? = null
    private val viewBinding get() = _viewBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _viewBinding = ActivityMainBinding.inflate(layoutInflater)

        setTheme(R.style.Theme_ShoppingListApp)
        setContentView(viewBinding.root)

        viewBinding.titleView.text = getString(R.string.app_title)
    }
}