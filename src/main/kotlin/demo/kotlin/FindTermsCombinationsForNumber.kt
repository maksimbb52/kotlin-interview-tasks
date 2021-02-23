package demo.kotlin

import java.util.*
import java.util.concurrent.ConcurrentLinkedQueue
import kotlin.collections.ArrayList

/**
 * Finds all variants of terms for a given number.
 */
fun findTermsForNumberFromArray(number: Int, array: IntArray): Array<IntArray> {
    return findCombinations(array.toList(), number)
        .parallelStream()
        .map { it.sorted() }
        .map { it.toIntArray() }
        .toArray { length -> arrayOfNulls<IntArray>(length) }
}

/**
 * Returns all combinations of terms of specified number.
 * @param combinations all combinations of terms
 * @param combination  combination of terms
 * @param sequence     input sequence of possible terms
 * @param number       the number to be represented as terms
 */
private fun findCombinations(
    sequence: List<Int>,
    number: Int
) : Set<List<Int>> {
    val combinations = mutableSetOf<List<Int>>()
    findTerm(combinations, ConcurrentLinkedQueue(), sequence, number, sequence.size - 1)
    return combinations
}

/**
 * Find term from sequence of specified number.
 * @param combinations all combinations of terms
 * @param combination  combination of terms
 * @param sequence     input sequence of possible terms
 * @param number       the number to be represented as terms
 * @param position        current position of checking terms in sequence
 */
private fun findTerm(
    combinations: MutableSet<List<Int>>,
    combination: Queue<Int>,
    sequence: List<Int>,
    number: Int,
    position: Int
) {
    if (position < 0) {
        return
    }
    val subtracted = sequence[position]
    val remainder = number - subtracted
    if (remainder == 0) {
        // We found last term in current combination
        // Add to combinations copy of combination with last term
        combinations.add(ArrayList<Int>(combination).also { it.add(subtracted) })
    } else if (remainder > 0) {
        // Try to find other terms of current possible combination
        combination.add(subtracted)
        findTerm(combinations, combination, sequence, remainder, position - 1)
        // Returned outside. Return combination to default state
        combination.remove(subtracted)
    }
    // We continue to search for other terms, even if we have already found the last term in this combination.
    // if remainder was 0, imagine that we did not find this term and continue to search.
    findTerm(combinations, combination, sequence, number, position - 1)
}