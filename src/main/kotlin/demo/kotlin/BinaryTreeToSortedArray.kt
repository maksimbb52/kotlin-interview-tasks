package demo.kotlin

import demo.kotlin.model.Node

fun <T>binaryTreeToSortedList(node: Node<T>?, result: MutableList<Comparable<T>>) {
    if (node == null) {
        return
    }
    if (node.left == null) {
        if (node.right == null) {
            result.add(node.value)
            return
        }
        result.add(node.value)
        binaryTreeToSortedList(node.right, result)
    } else {
        binaryTreeToSortedList(node.left, result)
        result.add(node.value)
        if (node.right != null) {
            binaryTreeToSortedList(node.right, result)
        }
    }
}