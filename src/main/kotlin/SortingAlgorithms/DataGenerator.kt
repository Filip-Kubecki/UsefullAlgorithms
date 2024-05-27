package SortingAlgorithms

import java.util.Random

class DataGenerator {
    fun shuffledArray(arraySize: Int) : IntArray {
        var array : IntArray = IntArray(arraySize)
        for (i in 1..arraySize-1) {
            array[i] = i
        }
        for(i in 0..array.size - 1) {
            val randomIndexToSwap = array[Random().nextInt(array.size-1)]
            val temp = array[randomIndexToSwap]
            array[randomIndexToSwap] = array[i]
            array[i] = temp
        }
        return array
    }
}