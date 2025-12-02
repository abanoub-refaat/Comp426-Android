package com.example.unscramble

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

var counter = 0;

class HomeViewModel: ViewModel() {
    val expanded = mutableStateOf(false)
    fun DisplayCounter(isClicked: Boolean): Int {
        if (isClicked) {
            counter++
        }
        return counter
    }
}