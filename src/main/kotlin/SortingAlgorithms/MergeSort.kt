package SortingAlgorithms

class MergeSort : SortingAlgorithm() {
    fun sort(array: IntArray) : IntArray {
        var swaps = 0
        var comparisons = 0
        val startTimer = System.nanoTime()



        val endTimer = System.nanoTime()
        this.results = Results(swaps, comparisons,endTimer-startTimer)
        return array
    }
}