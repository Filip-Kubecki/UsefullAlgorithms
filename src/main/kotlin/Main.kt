import SortingAlgorithms.BubbleSort
import SortingAlgorithms.DataGenerator

fun main() {
    val dataGenerator = DataGenerator()
    val data: IntArray = dataGenerator.shuffledArray(11)

//    Shuffled array
    println(data.joinToString(" "))
//    Sorted array
    println(BubbleSort().sort(data).joinToString(" "))
}