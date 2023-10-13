//Diberikan 2 array (himpunan) int (bilangan bulat), kembalikan nilai True jika elemen pertama atau elemen terakhir kedua array tersebut sama. Kedua array memiliki banyak elemen satu atau lebih
//common_end([1, 2, 3], [7, 3]) → True
//common_end([1, 2, 3], [7, 3, 2]) → False
//common_end([1, 2, 3], [1, 3]) → True

fun common_end (array1: List<Int>, array2: List<Int>): Boolean{
    return (array1.first() == array2.first() || array1.last() == array2.last())
}
fun main(){
    println(common_end(listOf(1, 2, 3), listOf(7, 3)))
    println(common_end(listOf(1, 2, 3), listOf(7, 3, 2)))
    println(common_end(listOf(1, 2, 3), listOf(1, 3)))

}