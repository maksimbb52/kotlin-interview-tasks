package demo.kotlin


/**
 * Leaves one number among the duplicates, deletes the rest.
 * Also deletes non duplicated numbers.
 */
fun remainOneAmongDuplicates(nums: IntArray): IntArray {
    val filterSet: MutableSet<Int> = mutableSetOf()
    val resultSet: MutableSet<Int> = mutableSetOf()
    for (num in nums) {
        if (!filterSet.add(num)) {
            resultSet.add(num)
        }
    }
    return resultSet.toIntArray()
}