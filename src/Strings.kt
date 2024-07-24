fun main() {
    var firstname = "Eugene"
    var lastname = "Omurunga"

    println(firstname)
    println(firstname[0])
    println(lastname)
    println(lastname.uppercase())

    //String Concatenation
    println(firstname + lastname)
    println(firstname.plus(lastname))
    //space:
    println(firstname + " " + lastname)

    //String Interpolation
    println("My first name is" + firstname)
    println("My first name is $firstname")

    var num1 = 20
    var num2 = 55
    println("The sum of $num1 and $num2 is" + " " + (num1+num2))

}