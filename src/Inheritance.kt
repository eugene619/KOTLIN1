//Parent Class(or SuperClass or BaseClass)
open class Animal{
    var gender = "Female"
    var age = 2
    var hasfeathers = true

    fun sound(){
        println("Animal is speaking")
    }
}

open class Duck: Animal(){
    fun movement(){
         println("Duck is swimming")
    }
}

class Bird: Duck(){
    var hasscales = true
    fun move(){
         println("Bird is flying")
    }
}

fun main() {
    var a = Animal()
    println(a.age)
    
    var d = Duck()
    var b = Bird()

}