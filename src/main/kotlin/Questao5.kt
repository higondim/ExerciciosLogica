fun main () {
    println("Digite a nota da primeira unidade:")
    val und1 = readln().toDouble()

    println("Digite a nota da segunda unidade:")
    val und2 = readln().toDouble()

    val media = (und1 + und2) / 2
    println("A média do aluno é $media")

    if (media in 7.0..9.0){
        println("O aluno está aprovado!")
    } else if (media < 7) {
        println("O aluno está reprovado!")
    } else if (media >= 10) {
        println("O aluno foi aprovado com distinção!")
    }

}