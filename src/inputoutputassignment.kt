import java.util.Scanner


fun main() {
    var read = Scanner(System.`in`)

    println("Enter a letter:")
    var letter = readln().trim()[0]

    if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ) {
        println("Letter $letter is a vowel")
    }
    else{
        println("Letter $letter is a consonant")
    }
}

