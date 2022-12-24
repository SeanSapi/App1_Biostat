package com.example.biostat

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Introductory : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introductory)

        val enterButton = findViewById<Button>(R.id.transit)

        enterButton.setOnClickListener {
            val intent = Intent(this, StatCheck::class.java)
            startActivity(intent)

        }
        val abtBtn = findViewById<Button>(R.id.about1)
        abtBtn.setOnClickListener {
            val dlgBinder = layoutInflater.inflate(R.layout.about, null)

            val frstDialog = Dialog(this)
            frstDialog.setContentView(dlgBinder)

            frstDialog.setCancelable(true)
            frstDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            frstDialog.show()

        }
    }
}