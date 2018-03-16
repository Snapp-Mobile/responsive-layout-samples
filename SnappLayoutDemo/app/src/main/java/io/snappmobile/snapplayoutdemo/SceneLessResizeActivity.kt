package io.snappmobile.snapplayoutdemo

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.snappmobile.snapplayoutdemo.viewmodel.SceneTestViewModel

class SceneLessResizeActivity : AppCompatActivity() {


    private lateinit var viewModel: SceneTestViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resize_example)

        viewModel = ViewModelProviders.of(this).get(SceneTestViewModel::class.java)


    }

}
