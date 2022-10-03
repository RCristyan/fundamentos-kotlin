package fundamentos

class Carro(var cor: String, var ano: Int, val dono: Pessoa) {
}

fun main() {
    val carro = Carro(cor = "preto", ano = 2021, dono = Pessoa("Marcos", 35))
    println(carro.cor)
    println(carro.ano)

    carro.cor = "azul"
    println(carro.cor)

    println(carro.dono)

    carro.dono.nome = "Marquinhos"
    println(carro.dono)
}