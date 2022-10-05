package fundamentos

fun main() {

    // O operador '?' indica que um objeto pode ser nulo
    var nome : String? = "Fulano"

    // O operador '!!' garante que o objeto não é nulo
    val tamNome : Short = nome!!.length.toShort()

    println("tamNome = ${tamNome}")

    var tamNome2 : Int = nome.length
    println("tamNome2 = ${tamNome2}")

    // O operador '?:' retorna o valor do lado direito caso o valor do lado esquerdo seja nulo
    nome = null
    tamNome2 = nome?.length ?: 0
    println("tamNome2 = ${tamNome2}")
}
