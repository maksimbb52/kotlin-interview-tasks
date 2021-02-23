package demo.kotlin

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FindTermsCombinationsForNumberTest {

    @Test
    fun findAllCombinationsOfTermsSuccess() {
        //GIVEN
        val number = 13
        val sequence = intArrayOf(1, 2, 4, 5, 7, 8, 9)

        //WHEN
        val actualResult = findTermsForNumberFromArray(number, sequence)

        //THEN
        val expectedResult = arrayOf(
            intArrayOf(4, 9),
            intArrayOf(5, 8),
            intArrayOf(1, 4, 8),
            intArrayOf(1, 5, 7),
            intArrayOf(2, 4, 7)
        )
        assertArrayEquals(expectedResult, actualResult)
    }
}