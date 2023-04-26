fun main() {
    println("Aluno, informe abaixo qual turno você estuda. Digite 'M' para matutino, 'V' para vespertino e 'N' para noturno.")
    val turno = readln()

    when (turno) {
        "M" -> println("Bom dia!")
        "V" -> println("Boa tarde!")
        "N" -> println("Boa noite!")
    }
}