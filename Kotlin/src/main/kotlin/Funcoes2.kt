fun main() {
    endereco("rua", "cidade", "sp", "22013")

    // Numerando os parametros
    endereco(cidade = "Nome da rua", rua = "nome da rua", estado = "Nome do estado")

    // Varios parametros
    println(media(1f, 2f, 49f, 5.3f, 1f))

    //Generics
    println(media2(false, 2.4, 12f, "", true))

    // Any, unit e Nothing
    valores(10)
    valores("TESTE")
    valores('a')



}

fun endereco(rua: String, cidade: String, estado: String, cep: String = "", num: Int = 0) {

}

fun media(vararg notas: Float): Float {
    var soma = 0f
    for (n in notas) {
        soma += n
    }

    return (soma / notas.size)
}


// Ao usar o varang ele tem que vir por último e só pode ser usadao um por função
fun <T, J> media2(abc:J,vararg notas: T): Float {
    var soma = 0f
    for (n in notas) {
        if (n is Float) {
            soma += n
        }

    }

    return (soma / notas.size)

}

fun valores(valor:Any):Unit{
}

fun save():Nothing{
    TODO("AINDA VOU FAZER")
}