package com.example.ObjectTracking

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.ObjectTracking.ui.theme.SerialViewModel

class SerialViewModelFactory(
    private val application: Application,
    private val arViewModel: ARViewModel
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SerialViewModel::class.java)) {
            return SerialViewModel(application, arViewModel) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}