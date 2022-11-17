class Pessoa(
    val anoNascimento: Int,
    var nome: String
) {
    fun dormir() {

    }

    fun acordar() {
        println("Acordando...")
    }
}

fun main() {

    //Class - comportamentos e atributos

    // classe -> gera os objetos

    var pessoa: Pessoa = Pessoa(1995, "Lucas") // <--- Instancioando uma classe e clriando o objeto pessoa
    println(pessoa.nome)
    pessoa.acordar()
}