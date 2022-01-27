package com.chudnovskiy.lab_1_4_animsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val ship: ImageView = findViewById(R.id.shipView)
        val shipAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.ship_anim)
        ship.startAnimation(shipAnimation)
    }
}