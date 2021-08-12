package com.myapplicationdev.android.c347_l13_ex2_demo_kotlin_loop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCount.setOnClickListener {
            //for loop
            for (i in 1..5) {
                Log.d("MainActivity\n", "$i For loop")
            }
            //while loop
            var x = 1
            while (x < 6) {
                Log.d("MainActivity\n", "\n$x While loop")
                x++
            }
        }

        btnWord.setOnClickListener {
            //for-each loop
            val word = etWord.text.toString()
            for (letter in word) {
                Log.d("MainActivity\n", "\n$letter")
            }
        }
    }
}