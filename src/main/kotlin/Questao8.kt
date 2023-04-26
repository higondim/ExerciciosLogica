fun main() {
    println("Olá, gostaria de saber o preço de três celulares, levarei o que for mais barato.")

    println("Qual o preço do Iphone 11?")
    val iphone = readln().toInt()

    println("Qual o preço do Samsung S23?")
    val sam = readln().toInt()

    println("Qual o preço do Motorola G52?")
    val moto = readln().toInt()


    if (iphone < sam && iphone < moto) {
        println("O iphone é o celular mais barato!")
    } else if (sam < iphone && sam < moto) {
        println("O samsung é o celular mais barato!")
    } else {
        println("O celular mais barato é motorola!")
    }

}