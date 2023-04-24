fun main() {
    println("Digite 3 números:")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()


    if (num1 > num2 && num1 > num3) {
        println("O número maior é o $num1")
    } else if (num2 > num1 && num2 > num3)
        println("O número maior é o $num2")
    else {
        println("O número maior é o $num3")
    }

}