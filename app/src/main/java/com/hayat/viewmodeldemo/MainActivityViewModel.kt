package com.hayat.viewmodeldemo

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal : Int) : ViewModel(),Observable {
    @Bindable
    var total = MutableLiveData<String>()
    @Bindable
    var totalinput = MutableLiveData<String>()

    init {
        total.value = startingTotal.toString()
    }

    fun setTotal(){
        total.value =(total.value?.toInt())?.plus(totalinput.value!!.toInt()).toString()
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }
}