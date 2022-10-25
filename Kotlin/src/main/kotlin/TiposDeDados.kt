fun main() {
    /**
     * Tipos de dados
     * Type bit
     * Double 64
     * Float 32
     * Lang 64
     * Int 32
     * Short 16
     * Byte 8
     * Boolean True or False
     * String ? Vai depender do tamanho do conteudo
     * Char ?
     */

    var c: Char = 'a'
    var s: String = "Um texto qualquer"
    var b: Boolean = true

    var double: Double = 10.0
    var float: Float = 10f
    var long: Long = 10L
    var int: Int = 10
    var short: Short = 10
    var byte: Byte = 10

    println("Double MAX ${Double.MAX_VALUE} - MIN ${Double.MIN_VALUE}")
    println("Float MAX ${Float.MAX_VALUE} - MIN ${Float.MIN_VALUE}")
    println("Long MAX ${Float.MAX_VALUE} - MIN ${Float.MIN_VALUE}")
    println("Int MAX ${Int.MAX_VALUE} - MIN ${Int.MIN_VALUE}")
    println("Short MAX ${Short.MAX_VALUE} - MIN ${Short.MIN_VALUE}")
    println("Byte MAX ${Byte.MAX_VALUE} - MIN ${Byte.MIN_VALUE}")
}