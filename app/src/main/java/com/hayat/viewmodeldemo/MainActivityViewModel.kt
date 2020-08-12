package com.hayat.viewmodeldemo

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal : Int) : ViewModel(),Observable {
    private var total = MutableLiveData<Int>()
    @Bindable
    var totalinput = MutableLiveData<String>()

    val totalData : LiveData<Int>
        get() = total
    init {
        total.value = startingTotal
    }

    fun setTotal(){
        total.value =(total.value)?.plus(totalinput.value?.toInt()!!)
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }
}