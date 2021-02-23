package demo.kotlin.model

data class Node<T>(
    val value: Comparable<T>,
    val left: Node<T>?,
    val right: Node<T>?)