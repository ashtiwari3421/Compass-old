package com.example.compass

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import android.view.animation.Animation
import android.view.WindowManager
private val splashScreen = 4000


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val topAnim: Animation = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        val bottomAnim: Animation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
        val appLogo: ImageView = findViewById(R.id.appLogo)
        val appName: TextView = findViewById(R.id.appName)


        appLogo.animation = topAnim
        appName.animation = bottomAnim





    }
}