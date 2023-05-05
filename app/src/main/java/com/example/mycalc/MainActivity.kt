package com.example.mycalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder

class MainActivity : AppCompatActivity () {

     private lateinit var btnAdd: Button
     private lateinit var btnSubtract: Button
     private lateinit var btnMultiply: Button
     private lateinit var btnDiv: Button
     private lateinit var editTextN1: EditText
     private lateinit var editTextN2: EditText
     private lateinit var answer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Initialize views
              btnAdd = findViewById(R.id.btn_add)
              btnSubtract= findViewById(R.id.btn_subtract)
               btnMultiply = findViewById(R.id.btn_multiply)
              btnDiv = findViewById(R.id.btn_divide)
              editTextN1 = findViewById(R.id.number1)
             editTextN2 = findViewById(R.id.number2)
              answer = findViewById(R.id.answer)


        // Add click listeners for the buttons
        btnAdd.setOnClickListener {
            val n1 = editTextN1.text.toString().toDoubleOrNull()
            val n2 = editTextN2.text.toString().toDoubleOrNull()

            if (n1 != null && n2 != null) {
                val result = n1 + n2
                answer.text = "Result: $result"
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        btnSubtract.setOnClickListener {
            val n1 = editTextN1.text.toString().toDoubleOrNull()
            val n2 = editTextN2.text.toString().toDoubleOrNull()

            if (n1 != null && n2 != null) {
                val result = n1 - n2
                answer.text = "Result: $result"
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        btnMultiply.setOnClickListener {
            val n1 = editTextN1.text.toString().toDoubleOrNull()
            val n2 = editTextN2.text.toString().toDoubleOrNull()

            if (n1 != null && n2 != null) {
                val result = n1 * n2
                answer.text = "Result: $result"
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        btnDiv.setOnClickListener {
            val n1 = editTextN1.text.toString().toDoubleOrNull()
            val n2 = editTextN2.text.toString().toDoubleOrNull()

            if (n1 != null && n2 != null) {
                if (n2 == 0.0) {
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show()
                } else {
                    val result = n1 / n2
                    answer.text = "Result: $result"
                }
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }
    }
}