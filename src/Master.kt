import december.*

fun main() {
    val riddle: December<Int, Int> = December2()
    println("Answer 1: " + riddle.star1())
    println("Answer 2: " + riddle.star2())
}
