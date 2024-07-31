class Person{
    //Properties/ Attributes/ Characteristics
    var name = "John"
    var age = 24

    //Behaviour/ Method/ Function
    fun sound(){
        println("Person is speaking")
    }
}

//Creating an Object
fun main() {
    var teacher = Person()
    println(teacher.age)
    println(teacher.name)
    teacher.sound()

    var student = Person()
    var accountant = Person()
}