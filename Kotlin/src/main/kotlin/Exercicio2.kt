import kotlin.math.round

fun main() {
    println("Exercicio 1")
 yerTranform(2)

    println("Exercicio 2")
    println(lenghString("Lucas"))

    println("Exercicio 3")
    println(calcCubNunber(3))

    println("Exercicio 4")
    converMtoKM(10.0)
}

fun yerTranform(year:Int){
    println("$year anos equivalem a: ")
    println("${year * 12} meses")
    println("${year * 365} Dias")
    println("${year * 8760} Horas")
    println("${year * 525600} minutos")
    println("${year * 31557600} Segundos")
}

fun lenghString(str: String) = "O tamanho da texto $str é: ${str.length}"

fun calcCubNunber(number:Int) = number * number * number

fun converMtoKM(milha:Double){
    println(" Uma(s) $milha minhla é igual a ${milha * 1.6} Km")
}
