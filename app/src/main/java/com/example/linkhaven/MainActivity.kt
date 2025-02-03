package com.example.linkhaven

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.linkhaven.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnLogin.setOnClickListener {
                startActivity(Intent(this@MainActivity, LoginActivity::class.java))
            }

            btnSignup.setOnClickListener {
                startActivity(Intent(this@MainActivity, RegistrationActivity::class.java))
            }

            btnRetrieve.setOnClickListener {
                startActivity(Intent(this@MainActivity, AccountRetrievalActivity::class.java))
            }
        }
    }
}