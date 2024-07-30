import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter temperature of patient:")
    var temperature = read.nextInt()

    if (temperature > 37){
        println("High fever")
    }
    else if (temperature < 37){
        println("Low fever")
    }
    else{
        println("Normal temperature")
    }
}