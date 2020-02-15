package com.elabs1.elabs04kt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b1:Button = findViewById(R.id.b1)
        val t1:TextView = findViewById(R.id.t1)
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        t1.setOnClickListener {
            val intent = Intent( this,Main2activity::class.java)
            startActivity(intent)
            finish()

        }

        b1.setOnClickListener {
            val intent = Intent( this,Main2activity::class.java)
            intent.putExtra("name", "Rish")
            startActivity(intent)

            finish()
        }
    }
}
