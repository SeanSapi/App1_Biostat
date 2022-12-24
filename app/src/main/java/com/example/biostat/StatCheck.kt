package com.example.biostat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_stat_check.*

class StatCheck : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stat_check)
    }

    fun fusion(view: View){
        val name = input1.text.toString()
        val birthdate = input2.text.toString()
        val age = input3.text.toString().toInt()

        val intent = Intent(this@StatCheck, Results::class.java)
        intent.putExtra("Name", name)
        intent.putExtra("Birthdate", birthdate)
        intent.putExtra("Age", age)
        startActivity(intent)
    }
}