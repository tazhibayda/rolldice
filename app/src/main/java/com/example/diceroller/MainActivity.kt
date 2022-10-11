package com.example.diceroller

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll)

        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()
            var num:Int = getDice()
            val number:TextView = findViewById(R.id.number)
            number.visibility = View.VISIBLE
            number.text = num.toString()
        }
    }
    fun getDice(): Int{
        return (1..6).random()
    }
}