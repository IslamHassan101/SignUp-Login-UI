package com.example.signup_login_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.signup_login_ui.databinding.ActivityRegestrationBinding

class RegestrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegestrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegestrationBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val signInClick = binding.tvSignIn

        signInClick.setOnClickListener {
            val intent = Intent(this, LogInActivity::class.java)
            startActivity(intent)
        }
    }
}