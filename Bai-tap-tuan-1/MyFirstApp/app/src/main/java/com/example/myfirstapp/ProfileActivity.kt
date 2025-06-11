package com.example.myfirstapp  // Thay tên package nếu bạn đặt khác

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.R

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val backButton = findViewById<ImageButton>(R.id.btn_back)
        val editButton = findViewById<ImageButton>(R.id.btn_edit)

        backButton.setOnClickListener {
            Toast.makeText(this, "Back clicked", Toast.LENGTH_SHORT).show()
        }

        editButton.setOnClickListener {
            Toast.makeText(this, "Edit clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
