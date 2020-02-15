package com.elabs1.elabs04kt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Main2activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2activity)

        val t2:TextView = findViewById(R.id.name)
        val b2:Button = findViewById(R.id.b2)
        val i = intent
        val s = i.getStringExtra("name")
        t2.text = s
        b2.setOnClickListener {
            val intent = Intent( this,MainActivity::class.java)
            startActivity(intent)

        }




    }
}
