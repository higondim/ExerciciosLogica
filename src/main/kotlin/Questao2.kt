fun main() {
    println("Digite um número:")
    val num = readln().toInt()

    val numNeutro = 0

    if (num > numNeutro) {
        println("O número $num é positivo!")
    } else if (num < numNeutro) {
        println("O número $num é negativo!")
    }
}