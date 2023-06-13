package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var diceImageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn: Button = findViewById(R.id.roll_btn)
//        rollBtn.text ="Lets Roll"
        rollBtn.setOnClickListener {
//            Toast.makeText(this, "Btn clicked", Toast.LENGTH_LONG).show()
            rollDice()
        }
        diceImageView=findViewById(R.id.dice_img)

    }

    private fun rollDice() {

        val drawableRes = when((1..6).random()){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
//        val diceImg: ImageView = findViewById(R.id.dice_img)
        diceImageView.setImageResource(drawableRes)

    }
}