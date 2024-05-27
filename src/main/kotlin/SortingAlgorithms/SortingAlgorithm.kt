package SortingAlgorithms

open class SortingAlgorithm {
//    Change position of the item in the first index with the item in the second index.
    fun swap(firstIndex: Int, secondIndex: Int, array: IntArray) : IntArray {
        val temp = array[firstIndex]
        array[firstIndex] = array[secondIndex]
        array[secondIndex] = temp
        return array
    }

//    Returns bigger value
    fun compare(firstIndex: Int, secondIndex: Int, array: IntArray) : Boolean{
        return array[firstIndex] > array[secondIndex]
    }
}