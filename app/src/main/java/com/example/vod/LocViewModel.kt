package com.example.vod
import android.location.Location
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
class LocViewModel : ViewModel() {
    val LocationLiveData = MutableLiveData<Location>()

}