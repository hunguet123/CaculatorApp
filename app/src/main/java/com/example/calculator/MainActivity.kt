package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var calculate = Calculate()
    private var inputText = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun numberAction(view: View) {
        if (view is Button) {
            txt_calculate.append(view.text)
            inputText += view.text.toString()
        }
    }

    fun operatorAction(view: View) {
        if (view is Button) {
            txt_calculate.append(view.text)
            inputText += view.text.toString()
        }
    }

    fun allClearAction(view: View) {
        txt_result.text = ""
        txt_calculate.text = ""
        calculate.clearList()
        inputText = ""
    }

    fun resultAction(view: View) {
        calculate.digitsOperator(inputText)
        txt_result.text = calculate.result().toString()
        calculate.clearList()
    }

    fun percentAction(view: View) {
        if (view is Button) {
            txt_calculate.append(view.text)
            inputText += "÷100"
        }
    }

    fun deleteAction(view: View) {
        if (view is Button) {
            val textCalculate = txt_calculate.text
            txt_calculate.text = textCalculate.substring(0, textCalculate.length - 1)
            inputText = txt_calculate.text.toString()
        }
    }


}
