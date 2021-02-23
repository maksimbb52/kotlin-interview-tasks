package demo.kotlin

import demo.kotlin.model.Node
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.*

class BinaryTreeToSortedArray {

    @Test
    fun binaryTreeToSortedListSuccess() {
        //GIVEN
        val node1 = Node(1, null, null)     //            4
        val node3 = Node(3, null, null)     //     2            7
        val node2 = Node(2, node1, node3)            //    1  3       5        10
        val node6 = Node(6, null, null)     //                 6     9  11
        val node5 = Node(5, null, node6)         //                      8     12
        val node8 = Node(8, null, null)     //                                 14
        val node9 = Node(9, node8, null)        //                               13  15
        val node13 = Node(13, null, null)   // Result: sorted array 1..15
        val node15 = Node(15, null, null)
        val node14 = Node(14, node13, node15)
        val node12 = Node(12, null, node14)
        val node11 = Node(11, null, node12)
        val node10 = Node(10, node9, node11)
        val node7 = Node(7, node5, node10)
        val node4root = Node(4, node2, node7)

        //WHEN
        val actualResult = LinkedList<Comparable<Int>>()
        binaryTreeToSortedList(node4root, actualResult)

        //THEN
        val expectedResult : Array<Comparable<Int>> = (1 .. 15).toList().toTypedArray()
        assertArrayEquals(expectedResult, actualResult.toTypedArray())
    }
}