package SortingAlgorithms

class BubbleSort : SortingAlgorithm() {
    var results : Results = Results(0, 0, 0)
    fun sort(array: IntArray): IntArray {
        var swaps = 0
        var comparisons = 0
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
        println("Size: "+array.size+"\nSwaps: "+swaps+"\nComparisons: "+comparisons)
        return array
    }
}