package io.snappmobile.snapplayoutdemo.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData

/**
 * Created by juhani on 10.02.18.
 */
class CoroutineTestViewModel(application: Application) : AndroidViewModel(application) {


    val counterLiveData: MutableLiveData<Int> = MutableLiveData()


    init {
        counterLiveData.value = 0
    }

    fun increaseCount() {
        counterLiveData.value = (counterLiveData.value ?: 0) + 1
    }

}