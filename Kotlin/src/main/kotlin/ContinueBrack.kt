fun main() {

    val str = "aaaaabbbbccccdxdddd"
    var i = 0
    while (true){

        if(str[i] == 'x' ){
            print("O x foi encontrado na posição $i")
            break
        }
        i++

    }

    /*
    var i = 0
    while ( i < 199999){
        if(i == 50){
            break
        }
        print("$i ")
        i++
    }

     */
}