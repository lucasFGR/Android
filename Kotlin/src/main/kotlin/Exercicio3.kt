fun main() {

    println()
    println("Exercicio 1")
    println()
    verificaSeEquadrado()

    println()
    println("Exercicio 2")
    println()
    verificaTriangulo()

    println()
    println("Exercicio 4")
    println()
    entradaPortaria()
}

fun verificaSeEquadrado() {

    println("Digite um número")
    val n1 = readLine()

    println("Digite outro número")
    val n2 = readLine()

    if (n1 != null && n1 != "" && n2 != null && n2 != "") {
        if (n1 == n2) {
            println("Os dois lados são iguais, é um quadrado")
        } else {
            println("Os lados são diferentes")
        }
    } else {
        print("Os valores informados são inválidos.")
    }
}

fun verificaTriangulo() {

    println("Digite um número: ")
    val inputn1 = readLine()
    println("Digite outro número: ")
    val inputn2 = readLine()
    println("Digite outro número: ")
    val inputn3 = readLine()

    if (inputn1 != inputn2 || inputn1 != inputn3) {
        println("Não é um triangulo equilátero")
    } else {
        println("É um triangulo equilatero")
    }

}
// Resposta do segundo exericio : "Segunda String"

fun entradaPortaria() {
    println("Digite sua idade: ")
    val idade = readLine()

    if (idade != null) {
        if (idade.toInt() < 18) {
            println("Menores de idade não são permitidos")
        } else {
            println("Digite o tipo do convite: ")
            val tipoConvite = readLine()

            if (tipoConvite != null) {
                if (tipoConvite.lowercase() != "comum" && tipoConvite.lowercase() != "premium" && tipoConvite.lowercase() != "luxo") {
                    println("Tipo de convite  inválido")
                } else {
                    println("Digite o código do convite: ")
                    val codConvite = readLine()
                    if (tipoConvite.lowercase() == "premium" || tipoConvite.lowercase() == "luxo") {
                        if (codConvite != null) {
                            if (codConvite.uppercase().startsWith("XL")) {
                                println("Welcome :)")
                            }
                        } else {
                            println("Código do convite Inválido")
                        }
                    } else if (tipoConvite.lowercase() == "comum") {
                        if (codConvite != null) {
                            if (codConvite.uppercase().startsWith("XT")) {
                                println("Welcome :)")
                            } else {
                                println("Código do convite Inválido")
                            }
                        }
                    }
                }
            } else {
                println("Convite inválido")
            }
        }
    }

}