package com.app.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorHome : AppCompatActivity() {
    private lateinit var etNumber1: EditText
    private lateinit var etNumber2: EditText
    private lateinit var tvResult: TextView
    private var firstNumber: Double = 0.0
    private var secondNumber: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_home)
        etNumber1 = findViewById(R.id.et_number1)
        etNumber2 = findViewById(R.id.et_number2)
        tvResult = findViewById(R.id.tv_result)

        val btnAdd = findViewById<Button>(R.id.btn_add)
        btnAdd.setOnClickListener {
            if (validateInputs()) {
                firstNumber = etNumber1.text.toString().toDouble()
                secondNumber = etNumber2.text.toString().toDouble()
                tvResult.text = "${firstNumber + secondNumber}"
            }
        }

        val btnSubtract = findViewById<Button>(R.id.btn_subtract)
        btnSubtract.setOnClickListener {
            if (validateInputs()) {
                firstNumber = etNumber1.text.toString().toDouble()
                secondNumber = etNumber2.text.toString().toDouble()
                tvResult.text = "${firstNumber - secondNumber}"
            }
        }

        val btnMultiply = findViewById<Button>(R.id.btn_multiply)
        btnMultiply.setOnClickListener {
            if (validateInputs()) {
                firstNumber = etNumber1.text.toString().toDouble()
                secondNumber = etNumber2.text.toString().toDouble()
                tvResult.text = "${firstNumber * secondNumber}"
            }
        }

        val btnDivide = findViewById<Button>(R.id.btn_divide)
        btnDivide.setOnClickListener {
            if (validateInputs()) {
                firstNumber = etNumber1.text.toString().toDouble()
                secondNumber = etNumber2.text.toString().toDouble()
                if (secondNumber == 0.0) {
                    tvResult.text = getString(R.string.can_t_divide_by_zero)
                } else {
                    tvResult.text = "${firstNumber / secondNumber}"
                }
            }
        }
    }

    private fun validateInputs(): Boolean {
        var isValid = true
        if (etNumber1.text.isEmpty()) {
            etNumber1.error = "Please enter a number"
            isValid = false
        }

        if (etNumber2.text.isEmpty()) {
            etNumber2.error = "Please enter a number"
            isValid = false
        }

        return isValid
    }
}