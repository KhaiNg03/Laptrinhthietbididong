package com.example.btvn

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val ageInput = findViewById<EditText>(R.id.ageInput)
        val checkButton = findViewById<Button>(R.id.checkButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        checkButton.setOnClickListener {
            val name = nameInput.text.toString().trim()
            val ageText = ageInput.text.toString().trim()

            if (name.isEmpty() || ageText.isEmpty()) {
                resultText.text = "Vui lòng nhập đầy đủ họ tên và tuổi."
                return@setOnClickListener
            }

            val age = ageText.toIntOrNull()
            if (age == null) {
                resultText.text = "Tuổi không hợp lệ."
                return@setOnClickListener
            }

            val category = when {
                age > 65 -> "Người già"
                age in 6..65 -> "Người lớn"
                age in 2..6 -> "Trẻ em"
                else -> "Em bé"
            }

            resultText.text = "$name là $category"
        }
    }
}
