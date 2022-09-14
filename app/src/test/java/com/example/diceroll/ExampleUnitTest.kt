package com.example.diceroll

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test // @Test annotation lets the compiler know that the following method is a test, which lets it run as such
            /**
             *  fun addition_isCorrect() {
                assertEquals(4, 2 + 2) // he assertEquals() function asserts that an expected value
            }         should equal an actual value obtained through business logic.
             *
             */
    fun genrate_number() {
        val dice = Dice(6)
        val  rollResult = dice.roll()
       assertTrue("The Value of rollResult was not between 1 and 6", rollResult in 1..6 )


    }
}