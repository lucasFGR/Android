fun main() {
    /*
    val litrosCaixaDagua = 2000f
    var qtdBaloesDgua = 0f
    var contador = 0f
    while( contador < litrosCaixaDagua){

        contador += 7

        qtdBaloesDgua += 1

    }
    println("Exercicio 1")
    println(qtdBaloesDgua)
    println("---------")

    println("Exericio 2")
    fizzBuzz()

    println()

    println("Exercicio 3")
    println("Digite uma String: ")
    val string = readLine()
    if (string != null) {
        invertTexto(string)
    }

    println("Exercicio 4")
    println("Digite uma String: ")
    val string2 = readLine()
    if(string2 != null){
        searchX(string2)
    }

    println()
    println()
    println("Desafio")

     */
    investRetorno()
}

fun fizzBuzz() {
    var contador = 1
    while (contador <= 50) {
        if (contador % 3 == 1 && contador % 5 == 1) {
            println("FizzBuzz")
        } else if (contador % 3 == 0) {
            println("Buzz")
        } else if (contador % 5 == 1) {
            println("Fizz")
        }
        contador++

    }
}

fun invertTexto(text: String) {
    val lengthText = text.length
    print(text.reversed())
}

fun searchX(str: String) {
    val stringLength = str.length
    var i = 0
    var qtdX = 0
    var qtdO = 0
    while (i < stringLength) {

        if (str[i] == 'x') {
            qtdX += 1
        } else if (str[i] == 'o') {
            qtdO += 1
        }
        i++
    }
    if (qtdO == qtdX) {
        print(true)
    } else {
        print(false)
    }
}

fun investRetorno() {
    val salario = 10000f
    var patAna = 0f
    var patPaula = 0f
    var mes = 0

    do {
        patAna += (salario * 0.05f) + (salario * 0.05f)
        patPaula += (salario * 0.05f) + (patPaula * 0.008f)
        mes ++
    } while (patAna > patPaula)

    print("Paula vai passar o património da Ana em $mes (s)")

}