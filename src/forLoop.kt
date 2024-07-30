fun main() {
    for (num in 1..5){
        println(num)
    }

    for (letter in 'a'..'f'){
        println(letter)
    }

    for (x in 20..25){
        if (x == 23){
            break
        }
        println(x)
    }

     for (mynum in 185..190){
        if (mynum == 187){
            continue
        }
        println(mynum)
    }
}