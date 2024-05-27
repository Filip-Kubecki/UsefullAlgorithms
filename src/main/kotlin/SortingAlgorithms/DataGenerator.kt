package SortingAlgorithms

import java.util.Random

class DataGenerator {
//    TODO: Add: Reversed, Almost sorted, Many similar(stairs), shuffledEnd, Saw type (triangles), PipeOrgan (pyramid)
    fun shuffledArray(arraySize: Int) : IntArray {
        val array = IntArray(arraySize)
        for (i in 1..<arraySize) {
            array[i] = i
        }
        for(i in array.indices) {
            val randomIndexToSwap = array[Random().nextInt(array.size-1)]
            val temp = array[randomIndexToSwap]
            array[randomIndexToSwap] = array[i]
            array[i] = temp
        }
        return array
    }


}