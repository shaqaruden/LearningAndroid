fun main() {
    /* Comment Block */
    var myName = "Chad" // mutable
    val anotherName = "Shaqaruden" // immutable

    // Integers: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    val myAge: Int = 27 // Int
    val myByte: Byte = 13 // Byte
    val myShort: Short = 125 // Short
    val mylong: Long = 12_039_812_309_487_120_3 // Long

    // Floating Point Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F // F is required for float will assume Double
    val myDouble: Double = 3.14159265358979323846

    val isBool: Boolean = false

    val mychar: Char = 'A' // Single Character

    val myString = "Hello World"
    val firstCharInString = myString[0] // First character of string
    val lastCharInString = myString[myString.length - 1] // Last Character of string

    println("First Char: " + firstCharInString + ", Last Char: " + lastCharInString)

    print("Hello " + myName + ", whats up " + anotherName + "?")
}
