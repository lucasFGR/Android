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

fun fizzBuzz(){
    var contador = 1
    while(contador <= 50){

        if( contador % 3 == 1 ){
            println("Buzz")
        }else if(contador % 5 == 1){
            println("Fizz")
        }else if(contador % 3 == 1 && contador % 5 == 1){
            println("FizzBuzz")
        }
        contador++

    }
}

fun invertTexto (text:String){
    val  lengthText = text.length
    print(text.reversed())
}

fun searchX(str:String){
    val stringLength = str.length
    var i = 0
    var qtdX = 0
    var qtdO = 0
    while (i < stringLength){

        if(str[i] == 'x'){
            qtdX += 1
        }else if(str[i]== 'o'){
            qtdO += 1
        }
        i++
    }
    if(qtdO == qtdX){
        print(true)
    }else{
        print(false)
    }
}
fun investRetorno (){
    var i = 0
    val qtdEnvestida = 5 / 10 * 10000
    var investiAna = 10000
    var investiPaula = 5000
    while(true){
        val rendiMentoAna = (2 * investiAna) / 100
        val rendiMentoPaula = (8 * investiPaula) / 100
        investiAna += rendiMentoAna
        investiAna += qtdEnvestida

        investiPaula += rendiMentoPaula


        if( investiPaula > investiAna){
            println("$i meses")
            println("TOTAL PAULA: $investiPaula")
            print("TOTAL ANA: $investiAna")
            break
        }
        i++
    }

}