package fundamentos

class PrimeiraClasse(
    val nome: String,
    val idade: Int
) {
    fun criarClasseComValoresPadrao(): PrimeiraClasse{
        return PrimeiraClasse("José", 45)
    }
}

class SegundaClasse(
    val nome: String,
    val idade: Int
) {
    companion object {
        fun criarClasseComValoresPadrao(): SegundaClasse {
            return SegundaClasse("Marcos", 53)
        }

        fun criarAPartirDaPrimeiraClasse(primeiraClasse: PrimeiraClasse): SegundaClasse {
            return SegundaClasse(primeiraClasse.nome, primeiraClasse.idade)
        }
    }
}

fun main() {

    // Para criar uma classe com valores padrão, foi necessário instanciar a classe
    val primeiraClasse = PrimeiraClasse("Maria", 29).criarClasseComValoresPadrao()
    println(primeiraClasse.nome)
    println(primeiraClasse.idade)

    // Utilizando companion object, não é necessário instanciar a classe
    val segundaClasse = SegundaClasse.criarClasseComValoresPadrao()
    println(segundaClasse.nome)
    println(segundaClasse.idade)

    // Companion objects são ótimas ferramentas para criar builders
    val exemplo = SegundaClasse.criarAPartirDaPrimeiraClasse(primeiraClasse)
    println(exemplo.nome)
    println(exemplo.idade)
}
