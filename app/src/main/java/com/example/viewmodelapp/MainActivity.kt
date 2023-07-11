package com.example.viewmodelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get

class MainActivity : AppCompatActivity() {

    private lateinit var incrementBtn: Button
    private lateinit var counterView : TextView

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        incrementBtn = findViewById(R.id.increment_button_id);
        counterView  = findViewById(R.id.textView)

        /*We directly do not make viewModel object. ViewModelProvider(lifecycleOwner).get(Observer class name as java class)
         give the object of ViewModel class*/
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        incrementBtn.setOnClickListener {
            mainViewModel.increment()
            setText();
        }

        setText();

    }

    private fun setText(){
        counterView.text = mainViewModel.counter.toString()
    }

}