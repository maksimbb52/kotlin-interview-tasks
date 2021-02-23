package demo.kotlin

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RemainOneAmongDuplicatesTest {

    @Test
    fun remainOneAmongDuplicatesSuccess() {
        //GIVEN
        val numbers = intArrayOf(1, 1, 2, 3, 4, 4, 4, 5, 6, 7, 7, 7, 7, 1)

        //WHEN
        val result = remainOneAmongDuplicates(numbers)

        //THEN
        assertArrayEquals(intArrayOf(1, 4, 7), result)
    }
}