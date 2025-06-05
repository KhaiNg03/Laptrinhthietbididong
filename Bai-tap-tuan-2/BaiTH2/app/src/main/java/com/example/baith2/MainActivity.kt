package com.example.baith2

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailInput = findViewById<EditText>(R.id.emailInput)
        val checkButton = findViewById<Button>(R.id.checkButton)
        val emailError = findViewById<TextView>(R.id.emailError)

        checkButton.setOnClickListener {
            val email = emailInput.text.toString().trim()

            when {
                email.isEmpty() -> {
                    emailError.text = "Email không hợp lệ"
                    emailError.visibility = TextView.VISIBLE
                }
                !email.contains("@") -> {
                    emailError.text = "Email không đúng định dạng"
                    emailError.visibility = TextView.VISIBLE
                }
                else -> {
                    emailError.text = "Bạn đã nhập email hợp lệ"
                    emailError.setTextColor(resources.getColor(android.R.color.holo_green_dark))
                    emailError.visibility = TextView.VISIBLE
                }
            }
        }
    }
}
