package fundamentos

fun main() {
    var variavel1 = "Mutável"
    val variavel2 = "Não mutável"

    println(variavel1)
    println(variavel2)

    variavel1 = "variavel1 mudou"
    println(variavel1)

    val variavel3 : String
    variavel3 = "Inicializada depois"
    println(variavel3)

    val variavel4 = Variavel()
    variavel4.inicializaVariavel()
    println(variavel4.teste)
}

class Variavel {
    lateinit var teste : String

    fun inicializaVariavel() {
        teste = "Variável inicializada"
    }
}