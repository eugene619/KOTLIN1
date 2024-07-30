fun main() {
    //Predefined Functions
    println("eMobilis")

    var squareroot = Math.sqrt(81.0)
    println(squareroot)

     var roundoff = Math.round(32.27)
    println(roundoff)

    var myceil = Math.ceil(45.07)
    println(myceil)

    Day()
    add()
    student("Eugene",18)
    student("Eunice",28)
}

//User-defined Functions
fun Day(){
    println("Today is Tuesday")
}

fun add(){
    var num1 = 50
    var num2 = 50
    println(num1+num2)
}

//Parameters and Arguments
fun student(name: String, age: Int){
    println("$name is $age years old")
}