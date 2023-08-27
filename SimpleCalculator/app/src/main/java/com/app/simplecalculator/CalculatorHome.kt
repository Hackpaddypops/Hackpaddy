package com.app.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class CalculatorHome : AppCompatActivity(), View.OnClickListener {
    private lateinit var etNumber1: EditText
    private lateinit var etNumber2: EditText
    private lateinit var tvResult: TextView
    private lateinit var btAdd : Button
    private lateinit var btSubtract : Button
    private lateinit var btMultiply : Button
    private lateinit var btDivide : Button
    private var firstNumber: Double = 0.0
    private var secondNumber: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_home)
        etNumber1 = findViewById(R.id.et_number1)
        etNumber2 = findViewById(R.id.et_number2)
        tvResult = findViewById(R.id.tv_result)
        btAdd = findViewById(R.id.btn_add)
        btSubtract = findViewById(R.id.btn_subtract)
        btMultiply = findViewById(R.id.btn_multiply)
        btDivide = findViewById(R.id.btn_divide)
        btAdd.setOnClickListener(this)
        btSubtract.setOnClickListener(this)
        btMultiply.setOnClickListener(this)
        btDivide.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (etNumber1.text.isEmpty() || etNumber2.text.isEmpty()) {
            Toast.makeText(this,"Please Enter both the numbers!",Toast.LENGTH_SHORT).show()
        } else {
            firstNumber = etNumber1.text.toString().toDouble()
            secondNumber = etNumber2.text.toString().toDouble()
            if (v != null) {
                when (v.id) {
                    R.id.btn_add -> {
                        tvResult.text = "${firstNumber + secondNumber}"
                    }

                    R.id.btn_subtract -> {
                        tvResult.text = "${firstNumber - secondNumber}"
                    }

                    R.id.btn_divide -> {
                        if (secondNumber == 0.0) {
                            tvResult.text = getString(R.string.can_t_divide_by_zero)
                        } else {
                            tvResult.text = "${firstNumber / secondNumber}"
                        }
                    }

                    R.id.btn_multiply -> {
                        tvResult.text = "${firstNumber * secondNumber}"
                    }
                }
            }
        }
    }
}