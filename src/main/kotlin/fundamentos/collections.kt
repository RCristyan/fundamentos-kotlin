package fundamentos

fun main() {
    val lista = mutableListOf<Int>(0, 1, 2, 3, 4, 5, 6)
    lista.add(8)
    println(lista)

    val pares = lista.filter { it % 2 == 0 }

    // forEach é outra forma de iterar sobre uma collection
    pares.forEach {
        println(it)
    }

    // Um set não contém valores repetidos
    val mySet = setOf<Double>(1.2, 1.3, 1.3, 1.3, 1.3, 1.5, 1.5, 2.0)
    println(mySet)

    // Map mapeia chaves e valores, de forma parecida com dicionários Python
    val pessoas = mutableMapOf<String, Int>("José" to 30, "Maria" to 45)
    pessoas["Bruno"] = 12
    println(pessoas)

    // Cada chave é única. Caso já exista, o valor é sobrescrito
    pessoas["José"] = 28
    println(pessoas)

    // O método putIfAbsent garante que o valor não será sobrescrito caso a chave exista
    pessoas.putIfAbsent("José", 60)
    println(pessoas)
}
