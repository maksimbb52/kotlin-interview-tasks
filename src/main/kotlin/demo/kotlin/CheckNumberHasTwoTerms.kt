package demo.kotlin

fun checkNumberHasTwoTerms(number: Int, array: IntArray) : Boolean {
    val set = mutableSetOf<Int>()
    for (e in array) {
        if (set.contains(number - e))
            return true
        set.add(e)
    }
    return false
}