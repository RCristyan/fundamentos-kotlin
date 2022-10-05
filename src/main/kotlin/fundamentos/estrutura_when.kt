package fundamentos

fun main() {
    println(mencaoAtribuida(10.0))
    println(mencaoAtribuida(3.7))
    println(mencaoAtribuida(155.5))

    println("exemplo 2")
    println(comecaComOi("oi tudo bem"))
    println(comecaComOi("hello"))

    when{
        comecaComOi(394) -> println("Isso não começa com oi")
        comecaComOi("oi meu chapa") -> println("Começa com oi")
    }
}

fun mencaoAtribuida(nota: Double) : String {
    return when(nota) {
        in 9.0 .. 10.0 -> "SS"
        in 7.0 .. 8.9 -> "MS"
        in 5.0 .. 6.9 -> "MM"
        in 3.0 .. 4.9 -> "MI"
        in 0.1 .. 2.9 -> "II"
        0.0 -> "SR"
        else -> {
            println("É possível executar um bloco de código no when")
            "Nota inválida"
        }
    }
}

fun comecaComOi(valor: Any): Boolean {
    return when(valor) {
        is String -> valor.startsWith("oi")
        else -> false
    }
}
