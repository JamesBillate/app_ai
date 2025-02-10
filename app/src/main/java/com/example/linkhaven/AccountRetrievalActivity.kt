package com.example.linkhaven

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.linkhaven.databinding.ActivityAccountRetrievalBinding

class AccountRetrievalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAccountRetrievalBinding

    // Creation of the variable
    private lateinit var etEmail : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccountRetrievalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize and access the value of email
        etEmail = findViewById(R.id.etEmail)

        binding.apply {
            btnSubmit.setOnClickListener() {
                retrieveAccount()
            }

            btnBack.setOnClickListener() {
                startActivity(Intent(this@AccountRetrievalActivity, WelcomeActivity::class.java))
            }
        }
    }

    private fun retrieveAccount() {
        // Process the value from the text field
        val email = etEmail.text.toString().trim()

        when {
            TextUtils.isEmpty(email) -> {
                showToast("Email is required!")
                return
            }
            !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> {
                showToast("Enter a valid email!")
                return
            }
            else -> {
                showToast("Account Retrieved")
                startActivity(Intent(this@AccountRetrievalActivity, WelcomeActivity::class.java))
                finish()
            }
        }
    }


    private fun showToast(message: String) {
        Toast.makeText(this@AccountRetrievalActivity, message, Toast.LENGTH_SHORT).show()
    }
}