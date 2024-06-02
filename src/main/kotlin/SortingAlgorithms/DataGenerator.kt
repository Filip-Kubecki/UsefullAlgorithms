package SortingAlgorithms

import java.util.Random

class DataGenerator {
//    TODO: Saw type array (triangles). Also add shuffleArray function that shuffles IntArray given as parameter
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

    fun reversedArray(arraySize: Int) : IntArray {
        val array = IntArray(arraySize)
        for (i in 1..arraySize) {
            array[arraySize-i] = i
        }
        return array
    }

    fun almostSortedArray(arraySize: Int, percentUnsorted: Int) : IntArray {
        val array = IntArray(arraySize)
        for (i in 1..arraySize-1) {
            array[i] = i
        }
        val percentage = (array.size*(percentUnsorted/200f)).toInt()
        for(i in 1..percentage) {
            val firstRandomIndexToSwap = array[Random().nextInt(array.size-1)]
            val secondRandomIndexToSwap = array[Random().nextInt(array.size-1)]
            val temp = array[firstRandomIndexToSwap]
            array[firstRandomIndexToSwap] = array[secondRandomIndexToSwap]
            array[secondRandomIndexToSwap] = temp
        }
        return array
    }

    fun manySimilar(numberOfSteps: Int, stepSize: Int, stepIncrement: Int, startValue: Int = 0) : IntArray {
        val list = ArrayList<Int>()

        var tempIncrement = startValue
        for (i in 1..numberOfSteps) {
            for (j in 1..stepSize) {
                list.add(tempIncrement)
            }
            tempIncrement += stepIncrement
        }

        return list.toIntArray()
    }

    fun shuffledEndArray(arraySize: Int, lastIndexesShuffled: Int) : IntArray {
        val list = ArrayList<Int>(arraySize)
//        Creates sorted array
        for (i in 0..arraySize) {
            list.add(i)
        }
//        Takes value from random index, removes it and put on the end of the list
        var shuffledIndexes = 1
        repeat(lastIndexesShuffled) {
            val temp = list.get(Random().nextInt(0,list.size-shuffledIndexes))
            list.remove(temp)
            list.add(temp)
            shuffledIndexes++
        }

        return list.toIntArray()
    }

    fun pyramidArray(arraySize: Int) : IntArray {
        val list = ArrayList<Int>()

        for (i in arraySize - 1 downTo 0) {
            if (i % 2 != 0){
                list.add(i)
            }else{
                list.add(0,i)
            }
        }
        return list.toIntArray()
    }
}
