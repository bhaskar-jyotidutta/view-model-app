package com.example.viewmodelapp

import androidx.lifecycle.ViewModel

/*ViewModel class is independent of views. It is only used to store data*/
class MainViewModel : ViewModel() {

    var counter = 0

    fun increment(){

        counter++

    }

}