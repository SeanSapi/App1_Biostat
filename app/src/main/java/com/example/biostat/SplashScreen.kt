package com.example.biostat

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

@Suppress("DEPRECATION")
class SplashScreen : AppCompatActivity() {

    private val SPLASH_SCREEN = 5000

    private lateinit var topAnimation: Animation
    private lateinit var imageView: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //animations
        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_anim)

        imageView = findViewById(R.id.vecon)


        imageView.animation = topAnimation

        Handler().postDelayed({
            val intent = Intent(this, Introductory::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_SCREEN.toLong())
    }
}