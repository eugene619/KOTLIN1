import java.util.Scanner

fun main() {
    var rec = Scanner(System.`in`)

    println("Enter length:")
    var length = rec.nextInt()

    println("Enter width:")
    var width = rec.nextInt()

    var area = (length * width)
    println("The area of the rectangle is $area")
}