fun main() {
    var guziNiyazowaString = "Hello К7"

    val NUM = 60

    val word = "Hello K7"

    guziNiyazowaString = "$NUM $word"

    println("guziNiyazowaString: $guziNiyazowaString, NUM: $NUM, word: $word")

    if (NUM < 0) {
        println("Вы сохранили отрицательное число")
    } else if (NUM > 0) {
        println("Вы  сохранили положительное число")
    } else {
        println(" Вы сохранили ноль")
    }
}

