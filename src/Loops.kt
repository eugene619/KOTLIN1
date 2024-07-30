fun main() {
    //While

    var number = 30
    while (number <= 35){
        println("Number is $number")
        number++
    }

    var num = 10
    while (num >=5){
        println(num)
        num--
    }

    //Break
    var count = 100
    while (count <= 105){
        println(count)
        count++
        if (count == 103){
            break
        }
    }

    //Continue
    var x = 25
    while (x <= 30) {
        x++
        if (x == 27) {
            continue
        }
        println(x)
    }
}