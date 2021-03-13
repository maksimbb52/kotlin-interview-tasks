package demo.kotlin

import demo.kotlin.model.Node
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.*

class CheckNumberHasTwoTermsTest {

    @Test
    fun checkNumberHasToTermsTrue() {
        //GIVEN
        val number = 10
        val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)

        //WHEN
        val actualResult = checkNumberHasToTerms(number, array)

        //THEN
        assertTrue(actualResult)
    }

    @Test
    fun checkNumberHasToTermsFalse() {
        //GIVEN
        val number = 17
        val array = intArrayOf(1, 3, 10, 12, 17, 8)

        //WHEN
        val actualResult = checkNumberHasToTerms(number, array)

        //THEN
        assertFalse(actualResult)
    }
}