class Pessoa (val dtNascimento: String,val nome:String){

    var doc: String? = null

    constructor(dtNascimento: String, nome: String, doc: String) : this(dtNascimento, nome) {
        this.doc = doc
    }


    fun dormir() {
        println("Hora de mimir")
    }

    fun acordar() {
        println("Hora de acordar")
    }
}

fun main() {
    var pessoa1 = Pessoa("1996", "Lucas", "123")

    pessoa1.nome
    pessoa1.dtNascimento
    pessoa1.dormir()
    pessoa1.acordar()
}