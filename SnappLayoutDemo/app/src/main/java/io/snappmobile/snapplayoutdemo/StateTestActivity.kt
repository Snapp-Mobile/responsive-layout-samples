package io.snappmobile.snapplayoutdemo

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.snappmobile.snapplayoutdemo.viewmodel.StateTestViewModel
import kotlinx.android.synthetic.main.activity_state_test.*

class StateTestActivity : AppCompatActivity() {


    private lateinit var viewModel: StateTestViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(StateTestViewModel::class.java)

        setContentView(R.layout.activity_state_test)


        button3.setOnClickListener {
            viewModel.increaseCount()
        }


        viewModel.counterLiveData.observe(this, Observer<Int> {

            if (it != null) {
                textView.text = "Click count $it"
            }else{
                textView.text = "No clicks"
            }
        })
    }
}
