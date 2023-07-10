package com.example.viewmodelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var incrementBtn: Button
    private lateinit var counterView : TextView
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        incrementBtn = findViewById(R.id.increment_button_id);
        counterView  = findViewById(R.id.textView)

        incrementBtn.setOnClickListener {

            increment()

        }

    }

    fun increment(){

        counter++
        setText()

    }

    fun setText(){
        counterView.text = counter.toString()
    }

}