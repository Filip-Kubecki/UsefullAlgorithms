import SortingAlgorithms.BubbleSort
import SortingAlgorithms.DataGenerator

fun main() {
    val dataGenerator = DataGenerator()
    val data: IntArray = dataGenerator.shuffledArray(11)
    val bubbleSort = BubbleSort()

//    Shuffled array
    println(data.joinToString(" "))
//    Sorted array
    println(bubbleSort.sort(data).joinToString(" "))
    println(bubbleSort.results)
}