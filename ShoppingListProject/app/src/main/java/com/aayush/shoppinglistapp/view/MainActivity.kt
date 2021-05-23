package com.aayush.shoppinglistapp.view

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import com.aayush.shoppinglistapp.R
import com.aayush.shoppinglistapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _viewBinding: ActivityMainBinding? = null
    private val viewBinding get() = _viewBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _viewBinding = ActivityMainBinding.inflate(layoutInflater)

        window.statusBarColor = ContextCompat.getColor(this, R.color.colorPrimary)
        setTheme(R.style.AppTheme)
        setContentView(viewBinding.root)

        setSupportActionBar(viewBinding.toolbarView.toolbar)

        setViews()
    }

    private fun setViews() {
        setNavigationDrawer()
    }

    private fun setNavigationDrawer() {
        val drawerLayout = viewBinding.drawerLayout
        val mDrawerToggle = ActionBarDrawerToggle(
            this, drawerLayout,
            viewBinding.toolbarView.toolbar,
            R.string.open, R.string.close
        )

        drawerLayout.setDrawerListener(mDrawerToggle)

        mDrawerToggle.let {
            drawerLayout.addDrawerListener(mDrawerToggle)
        }

        viewBinding.toolbarView.menuItemIcon.setOnClickListener {
            openCloseDrawer()
        }
    }

    override fun onBackPressed() {
        if (viewBinding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            viewBinding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    private fun openCloseDrawer() {
        if (viewBinding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            viewBinding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            viewBinding.drawerLayout.openDrawer(GravityCompat.START)
        }
    }
}