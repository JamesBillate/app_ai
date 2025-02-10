package com.example.linkhaven

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.linkhaven.databinding.ActivityMainBinding
import com.example.linkhaven.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnRegister = findViewById<Button>(R.id.btnRegister)
        val btnRetrieve = findViewById<Button>(R.id.btnRetrieve)

        binding.apply {
            btnLogin.setOnClickListener {
                startActivity(Intent(this@WelcomeActivity, LoginActivity::class.java))
            }

            btnRegister.setOnClickListener {
                startActivity(Intent(this@WelcomeActivity, RegistrationActivity::class.java))
            }

            btnRetrieve.setOnClickListener {
                startActivity(Intent(this@WelcomeActivity, AccountRetrievalActivity::class.java))
            }
        }
    }
}