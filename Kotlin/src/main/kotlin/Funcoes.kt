fun main() {
    helloWordl();
    // Invocando uma funcao e atribuindo retorno dela para uma variavel
    val soma = sum(10,20)

    // Realizando a impressão na teal de uma variável
    println(soma)

    // Funcoes de String
    val str = "Programação Kotlin"

    println("Tamanho de uma string: ${str.length}")
    println("Posição (index) 0 da string: ${str[0]}")
    println("Meu texto começa com Pro ? : ${str.startsWith("Pro")}")
    println("Meu texto termina com ABC ? : ${str.endsWith("ABC")}")
    println(str.substring(2,4))
    println(str.replace("Kotlin","Kotlin é show"))
    println(str.lowercase())
    println(str.uppercase())
    println(str.trim())
}

// Criando uma função de soma com dois parametros quee retorna um inteiro
fun sum(a: Int, b:Int): Int {
        return a + b
}

// Criando uma função que realiza a impressão de um Hello Word na tela
fun helloWordl() {
    println("Ola mundo")
}

//Funcoes em uma unica linha

// Funcao escrita normalmente
fun divicao(a:Float, b:Float):Float {
    return  a / b
}

// tranformando a funcao em uma funcao de unica linha
fun divisicao2 (a:Float,b: Float) = a / b


