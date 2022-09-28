package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun numberAction(view: View) {
        if (view is Button) {
            txt_calculate.append(view.text)
        }
    }

    fun operatorAction(view: View) {
        if (view is Button) {
            txt_calculate.append(view.text)
        }
    }

    fun allClearAction(view: View) {
        txt_result.text = ""
        txt_calculate.text = ""
    }

    fun resultAction(view: View) {}


}
