fun main () {
    println("Olá, informe o seu sexo, as opções são 'F' ou 'M':")
    val sexo = readln()

    if (sexo == "F" || sexo == "f") {
        println("Você informou o sexo feminino!")
    } else if (sexo == "M" || sexo == "m") {
        println("Você informou o sexo masculino!")
    } else {
        println("Sexo inválido!")
    }
}