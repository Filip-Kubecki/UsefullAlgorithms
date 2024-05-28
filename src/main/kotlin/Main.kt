import SortingAlgorithms.BubbleSort
import SortingAlgorithms.DataGenerator

val SIZE_OF_DATA = 21

fun main() {
    val dataGenerator = DataGenerator()
    val dataShuffled: IntArray = dataGenerator.shuffledArray(SIZE_OF_DATA)
    val dataReverse: IntArray = dataGenerator.reversedArray(SIZE_OF_DATA)
    val dataAlmostSorted: IntArray = dataGenerator.almostSortedArray(SIZE_OF_DATA,10)
    val dataManySimilar: IntArray = dataGenerator.manySimilar(10,3,5)

    val bubbleSort = BubbleSort()

//    Shuffled array
    println("Shuffled: " + dataShuffled.joinToString(" "))
    println("Reverse: " + dataReverse.joinToString(" "))
    println("Almost Sorted: " + dataAlmostSorted.joinToString(" "))
    println("Many similar: " + dataManySimilar.joinToString(" "))

//    Sorted array
    println("\nSorted data(bubblesort):" + bubbleSort.sort(dataShuffled).joinToString(" "))
    println(bubbleSort.results)
}
