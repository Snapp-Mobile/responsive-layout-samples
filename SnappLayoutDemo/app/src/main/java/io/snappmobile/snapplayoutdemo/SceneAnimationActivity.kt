package io.snappmobile.snapplayoutdemo

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.transition.ChangeBounds
import android.transition.Scene
import android.transition.TransitionManager
import androidx.view.doOnLayout
import io.snappmobile.snapplayoutdemo.viewmodel.SceneTestViewModel
import kotlinx.android.synthetic.main.activity_scene_animation.*

class SceneAnimationActivity : AppCompatActivity() {


    private lateinit var viewModel: SceneTestViewModel
    private var currentLayout = -1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scene_animation)

        viewModel = ViewModelProviders.of(this).get(SceneTestViewModel::class.java)



        viewModel.layoutLiveData.observe(this, Observer<Int> {
            if (it != null && it != -1) {
                animateToColumns(it)
            }
        })


        root_layout.doOnLayout {


            Handler().postDelayed({
                viewModel.swapToColumns(resources.getInteger(R.integer.columns))

            }, 300)

        }
    }


    private fun animateToColumns(columns: Int) {
        if (currentLayout == columns) {
            return
        }
        currentLayout = columns

        val layout = when (columns) {
            1 -> R.layout.layout_scene_column
            2 -> R.layout.layout_scene_column_2
            else -> R.layout.layout_scene_column_3
        }

        val sceneColumn = Scene.getSceneForLayout(root_layout, layout, this)
        TransitionManager.go(sceneColumn, ChangeBounds())
    }
}
