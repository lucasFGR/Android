fun main() {
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

    println("Exercicio 3")
    println("Digite uma String: ")
    val string = readLine()
    if (string != null) {
        invertTexto(string)
    }

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