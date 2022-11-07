fun main() {
    print("Exercicio 1")
    println()
    for(i in 1..50){
        print("$i ")
    }

    println("")
    println("-------------")

    print("Exercicio 2")
    println()
    for(i in 50 downTo 1){
        print("$i ")
    }

    println("")
    println("-------------")

    print("Exercicio 3")
    println()
    for(i in 1..50){
        if(i % 5 == 0){
            continue
        }
        print("$i ")
    }

    println("")
    println("-------------")

    print("Exercicio 4")
    var soma = 0
    for (i in 1 ..500){
        soma += i
    }
    print(soma)

    println("")
    println("-------------")

    println("Exercicio 5")
    println("Digite um número: ")
    val entrada = readLine();
   if(entrada != null && entrada != ""){
       val inputConvert = entrada.toInt()
       for(i in 1  .. inputConvert){
           var string = "#"
           println(string.repeat(i))
       }
   }

}