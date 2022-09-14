package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // add/create methode when diced it rolled by findViewById . it find the button
        val rollButton: Button = findViewById(R.id.button) // how to find R.type.name

        // when the button is clicked- A click listener on the button:
        rollButton.setOnClickListener {   // setonClickLisnter unit view
            /* You'll have your app display a Toast - test
                val toast = Toast.makeText(this,"Dice Rolled", Toast.LENGTH_SHORT)
                // Display on the emulator:
                toast.show()
                *
                * */
            /*// another test : change to Textview, create new varable called resultTextView
                val resultTextView: TextView = findViewById(R.id.textView)
                resultTextView.text = "6" // to show the result
                **/
            rollButton.setOnClickListener {
                rollDice() // create func of sense not defined
            }


        }
    }

    // rollDice() method create and roll a dice, and then display the result in the TextView.
    private fun rollDice() {
        val dice = Dice(6) // dice have 6 sides and stores/new dice
        val diceRoll = dice.roll() // when diceroll happens call the roll method and save in the result var calles diceRoll,
        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView) // finding the TextView by id.
        resultTextView.text = diceRoll.toString() // diceRoll to convert it into a string.
    }
}

// create a dice class - create below main
class Dice(private val numSides: Int) {  // number of sides , of datatype Int
    fun roll(): Int { // create a methode for roll
        return (1..numSides).random()
    }
}
