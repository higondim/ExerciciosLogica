fun main() {
    println("Digite uma letra:")
    val letra = readln().toString()

    if (letra == "a" || letra == "A") {
        println("Você digitou uma vogal!")
    } else if (letra == "e" || letra == "E") {
        println("Você digitou uma vogal!")
    } else if (letra == "i" || letra == "I") {
        println("Você digitou uma vogal!")
    } else if (letra == "o" || letra == "O") {
        println("Você digitou uma vogal!")
    } else if (letra == "u" || letra == "U") {
        println("Você digitou uma vogal!")
    } else {
        println("Você digitou uma consoante!")
    }
}