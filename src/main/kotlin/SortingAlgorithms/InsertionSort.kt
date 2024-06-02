package SortingAlgorithms

class InsertionSort : SortingAlgorithm() {
    fun sort(array: IntArray): IntArray {
        var swaps = 0
        var comparisons = 0
        val startTimer = System.nanoTime()

        var i = 1
        while (i < array.size) {
            var j = i
            comparisons++
            while (j > 0 && compare(j-1,j,array)) {
                if(j != i)
                    comparisons++
                swap(j,j-1,array)
                swaps++
                j--
            }
            i++
        }

        val endTimer = System.nanoTime()
        this.results = Results(swaps, comparisons,endTimer-startTimer)
        return array
    }
}