package SortingAlgorithms

class SelectionSort : SortingAlgorithm() {
    fun sort(array: IntArray) : IntArray{
        var swaps = 0
        var comparisons = 0
        val startTimer = System.nanoTime()

        for (i in 0..array.size-1) {
            var smallestValueIndex = i
            for (j in i+1..array.size-1) {
                if (compare(smallestValueIndex,j,array)){
                    smallestValueIndex = j
                }
            }
            if (smallestValueIndex != i){
                swap(smallestValueIndex,i,array)
            }
        }

        val endTimer = System.nanoTime()
        this.results = Results(swaps, comparisons,endTimer-startTimer)
        return array
    }
}

fun main() {
    val data1 = DataGenerator().shuffledArray(20)
    println(data1.joinToString(" "))

    println(SelectionSort().sort(data1).joinToString(" "))
}