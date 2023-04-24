fun main ()  {
    println("Me diga um número:")
    val num1 = readln().toInt()

    println("Me dia um segundo número:")
    val num2 = readln().toInt()

    if (num1 > num2) {
        println("O maior número é o $num1")
    } else
        println("O maior número é o $num2")
}