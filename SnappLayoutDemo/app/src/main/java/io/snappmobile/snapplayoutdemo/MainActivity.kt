package io.snappmobile.snapplayoutdemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener { startActivity(Intent(this, SceneLessResizeActivity::class.java)) }
        button2.setOnClickListener { startActivity(Intent(this, StateTestActivity::class.java)) }
        button11.setOnClickListener { startActivity(Intent(this, SceneAnimationActivity::class.java)) }
    }
}
