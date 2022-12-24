package com.example.biostat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_results.*

class Results : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        val intent = getIntent()
        val name = intent.getStringExtra("Name")
        val birthdate = intent.getStringExtra("Birthdate")
        val age = intent.getIntExtra("Age", 0)
        result1.text = "Your name is " + name
        result2.text = "Your Birthdate is on " + birthdate
        result3.text = "Your age is " + age
    }
}