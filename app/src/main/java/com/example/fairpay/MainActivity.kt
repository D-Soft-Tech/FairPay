package com.example.fairpay

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Fairpay)
        setContentView(R.layout.activity_main)

        // remove action bar
        supportActionBar?.hide()
    }
}
