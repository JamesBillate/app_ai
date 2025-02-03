package com.example.linkhaven

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.linkhaven.databinding.ActivityPictureBinding

class PictureActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPictureBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPictureBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Display picture - set your picture in the ImageView
    }
}