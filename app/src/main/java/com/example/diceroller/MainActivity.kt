package com.example.diceroller

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll)

        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            val img: ImageView = findViewById(R.id.img)
            toast.show()
            img.visibility = View.VISIBLE
            changeImage(img, getDice())
        }
    }
    fun getDice(): Int{
        return (1..6).random()
    }
    fun changeImage(img:ImageView , num:Int){
        if (num == 1)
            img.setImageResource(R.drawable.dice1)
        else if(num == 2)
            img.setImageResource(R.drawable.dice2)
        else if(num == 3)
            img.setImageResource(R.drawable.dice3)
        else if(num == 4)
            img.setImageResource(R.drawable.dice4)
        else if(num == 5)
            img.setImageResource(R.drawable.dice5)
        else if(num == 6)
            img.setImageResource(R.drawable.dice6)
    }
}