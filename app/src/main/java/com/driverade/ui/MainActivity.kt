package com.driverade.ui

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.driverade.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_dashboard)

        // Setup triggers or accessibility shortcut button if present
    }
}
