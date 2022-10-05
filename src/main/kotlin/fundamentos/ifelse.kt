package fundamentos

fun main() {
    println("Par ou ímpar")
    parOuImpar(2)
    parOuImpar(3)

    println("Notas")
    resultadoDaNota(9.5)
    resultadoDaNota(4.8)
    resultadoDaNota(1.5)

    println("idade")
    println(maiorIdade(25))
    println(maiorIdade(17))
}

fun parOuImpar(numero: Int) {
    if(numero % 2 == 0) {
        println("${numero} é par")
    }
    else {
        println("${numero} é impar")
    }
}

fun resultadoDaNota(nota: Double) {
    if(nota >= 5.0) {
        println("${nota}: Aprovado")
    }
    else if(nota >= 4.0) {
        println("${nota}: Recuperação")
    }
    else {
        println("${nota}: Reprovado")
    }
}

fun maiorIdade(idade: Int): String{
    return if(idade >= 18) "maior" else "menor"
}
