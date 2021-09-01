fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toIntArray()
    // Do not touch lines above
    // Write only exchange actions here.
    val sw1 = numbers[0]
    val sw2 = numbers[numbers.lastIndex]
    numbers[0] = sw2
    numbers[numbers.lastIndex] = sw1
    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}