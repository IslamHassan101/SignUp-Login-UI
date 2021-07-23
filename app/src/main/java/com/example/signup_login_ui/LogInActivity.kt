package com.example.signup_login_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.signup_login_ui.databinding.ActivityLogInBinding

class LogInActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val clickLogin = binding.tvSignUp

        clickLogin.setOnClickListener {
            val intent = Intent(this, RegestrationActivity::class.java)
            startActivity(intent)
        }
    }
}