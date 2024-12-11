import kotlin.random.Random

fun main() {
    list()
    println()
    set()
    println()
    map()
}

fun list(){
    val numbers: MutableList<Int> = MutableList(10){ Random.nextInt(1, 101)}
    for (i in 1..<numbers.size){
        if(numbers[i] == numbers[i-1]){
            println("${numbers[i-1]} и ${numbers[i]} одинаковые")
            break
        }
    }
}

fun set(){
    val planet = mutableSetOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19)
    val circle = mutableSetOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val stadium = mutableSetOf(1, 2, 3, 4, 5, 6)

    val PC = planet intersect circle
    val PS = planet intersect stadium
    val CS = planet intersect stadium

    val students = (planet union circle union stadium).size

    val total = students + 3

    println("Всего учеников: $total")
}

fun map(){
    val input = listOf(
        "яблоко apple",
        "груша pear",
        "виноград grape",
        "груша apple",
        "дерево tree"
    )

    val engToRusMap = mutableMapOf<String, MutableSet<String>>()

    for (line in input) {
        val (rus, eng) = line.split(" ")
        engToRusMap.computeIfAbsent(eng) { mutableSetOf() }.add(rus)
    }

    for ((eng, rusWords) in engToRusMap) {
        println("$eng = ${rusWords.joinToString(", ")}")
    }
}