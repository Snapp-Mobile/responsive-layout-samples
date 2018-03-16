package io.snappmobile.snapplayoutdemo.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData

/**
 * Created by juhani on 10.02.18.
 */
class SceneTestViewModel(application: Application) : AndroidViewModel(application) {

    val layoutLiveData: MutableLiveData<Int> = MutableLiveData()

    init {
        layoutLiveData.value = -1
    }

    fun swapToColumns(columns: Int) {
        layoutLiveData.value = columns
    }

}