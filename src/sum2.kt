fun sum2(nums: List<Int>): Int {
    if (nums.size < 2) {
        return nums.sum()
    }
    return nums[0] + nums[1]
}

fun main() {
    val array1 = listOf(1, 2, 3)
    val array2 = listOf(1, 1)
    val array3 = listOf(1, 1, 1, 1)

    println(sum2(array1))
    println(sum2(array2))
    println(sum2(array3))
}
