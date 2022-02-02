package com.example.cryptocurrencykotlinapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cryptocurrencykotlinapplication.R

class AppViewModel() : ViewModel() {

     val mutableLiveData: MutableLiveData<ArrayList<Int>> = MutableLiveData()
    val liveData: LiveData<ArrayList<Int>> = mutableLiveData


    init {
        getViewPagerData()
    }

    fun getViewPagerData(): MutableLiveData<ArrayList<Int>> {
        var pics: ArrayList<Int> = ArrayList()
        pics.add(R.drawable.p1)
        pics.add(R.drawable.p2)
        pics.add(R.drawable.p3)
        pics.add(R.drawable.p4)
        pics.add(R.drawable.p5)

        mutableLiveData.postValue(pics)
        return mutableLiveData
    }
}