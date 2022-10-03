package fundamentos

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Nome: ${nome}. Idade: ${idade}"
    }
}