package com.example.linkhaven

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.linkhaven.databinding.ActivityAccountRetrievalBinding

class AccountRetrievalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAccountRetrievalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccountRetrievalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            val email = binding.etEmail.text.toString()
            if (email.isNotEmpty()) {
                Toast.makeText(this, "Account retrieval requested", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter a valid email", Toast.LENGTH_SHORT).show()
            }
        }
    }
}