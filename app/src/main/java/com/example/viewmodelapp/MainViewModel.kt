package com.example.viewmodelapp

import androidx.lifecycle.ViewModel

/*ViewModel class is independent of views. It is only used to store data*/
class MainViewModel(val initialValue: Int) : ViewModel() {

    var counter : Int = initialValue

    fun increment(){

        counter++

    }

}