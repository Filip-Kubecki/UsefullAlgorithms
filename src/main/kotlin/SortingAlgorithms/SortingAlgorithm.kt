package SortingAlgorithms

abstract class SortingAlgorithm {
//    Parameter that stores results of sorting
    var results : Results = Results(0,0,0)
        get() = field
        set(value) {field = value }

//    Change position of the item in the first index with the item in the second index.
    fun swap(firstIndex: Int, secondIndex: Int, array: IntArray) : IntArray {
        val temp = array[firstIndex]
        array[firstIndex] = array[secondIndex]
        array[secondIndex] = temp
        return array
    }

//    Returns true if first index is bigger than second one. Returns false for first index smaller or equal to second index
    fun compare(firstIndex: Int, secondIndex: Int, array: IntArray) : Boolean{
        return array[firstIndex] > array[secondIndex]
    }
}