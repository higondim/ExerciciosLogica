fun main() {
    println("Digite 3 números:")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()

    if (num1 > num2 && num2 > num3) {
        println("A ordem é $num1, $num2 e $num3!")
    } else if (num2 > num1 && num1 > num3) {
        println("A ordem é $num2, $num1 e $num3!")
    } else {
        println("A ordem é $num3, $num2 e $num1!")
    }
}