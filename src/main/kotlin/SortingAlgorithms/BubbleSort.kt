package SortingAlgorithms

class BubbleSort : SortingAlgorithm() {
    fun sort(array: IntArray): IntArray {
        var swaps = 0
        var comparisons = 0
        val startTimer = System.nanoTime()

        do {
            var change = false
            for (i in 1..array.lastIndex) {
                comparisons++
                if (compare(i-1,i,array)){
                    change = true
                    swap(i-1,i,array)
                    swaps++
                }
            }
        }while (change)

        val endTimer = System.nanoTime()
        this.results = Results(swaps, comparisons,endTimer-startTimer)
        return array
    }
}