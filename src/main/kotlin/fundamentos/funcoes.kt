package fundamentos

fun main() {
    println(retornaMensagem())
    println(retornaMensagemComNome("Larissa"))
    println(retornaMensagemComNome("Fulano"))
}

fun retornaMensagem() : String {
    return "Hello world!"
}

fun retornaMensagemComNome(nome : String = "Fulano") : String {
    return "Olá, ${nome}!"
}
