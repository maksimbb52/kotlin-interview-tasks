package demo.kotlin

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CheckNumberHasTwoTermsTest {

    @Test
    fun checkNumberHasTwoTermsTrue() {
        //GIVEN
        val number = 10
        val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)

        //WHEN
        val actualResult = checkNumberHasTwoTerms(number, array)

        //THEN
        assertTrue(actualResult)
    }

    @Test
    fun checkNumberHasTwoTermsFalse() {
        //GIVEN
        val number = 17
        val array = intArrayOf(1, 3, 10, 12, 17, 8)

        //WHEN
        val actualResult = checkNumberHasTwoTerms(number, array)

        //THEN
        assertFalse(actualResult)
    }
}