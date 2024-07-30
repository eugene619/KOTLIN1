fun main() {
    println("Welcome to myCalculator")
    println("1. Addition(+)")
    println("2. Subtraction(-)")
    println("3. Multiplication(*)")
    println("4. Division(/)")

    println("Enter first number:")
    val num1 = readLine()!!.toDouble()

    println("Enter operator")
    val mode = readLine()!!.toInt()

    println("Enter second number:")
    val num2 = readLine()!!.toDouble()

    when (mode){
        1 -> println("Answer: ${num1 + num2}")
        2 -> println("Answer: ${num1 - num2}")
        3 -> println("Answer: ${num1 * num2}")
        4 -> {
            if (num2 != 0.0){
                println("Answer: ${num1 / num2}")
            }
            else{
                 println("ERROR!! Number cannot be divided by zero")
            }
        }
        else -> println("ERROR!! Invalid input")

    }

}