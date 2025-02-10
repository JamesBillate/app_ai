package com.example.linkhaven

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.linkhaven.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnBack: Button

    private val validEmail = "user@androidkotlin.com"
    private val validPassword = "password12345"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnBack= findViewById(R.id.btnBack)

        binding.apply {

            btnLogin.setOnClickListener {
                loginUser()
            }
            btnBack.setOnClickListener {
                startActivity(Intent(this@LoginActivity, WelcomeActivity::class.java))
            }
        }
    }

    private fun loginUser() {
        val email = etUsername.text.toString().trim()
        val password = etPassword.text.toString().trim()

        // Input validation
        when {
            TextUtils.isEmpty(email) -> {
                showToast("Email is required!")
                return
            }
            !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> {
                showToast("Enter a valid email!")
                return
            }
            TextUtils.isEmpty(password) -> {
                showToast("Password is required!")
                return
            }
            email == validEmail && password == validPassword -> {
                // Successful login
                showToast("Login Successful!")
                startActivity(Intent(this@LoginActivity, MainActivity::class.java))
                finish()
            }
            else -> {
                // Incorrect login
                showToast("Invalid Email or Password!")
            }
       }
    }

    private fun showToast(message: String) {
        Toast.makeText(this@LoginActivity, message, Toast.LENGTH_SHORT).show()
    }
}
