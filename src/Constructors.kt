class Dog(var name: String, var breed: String, var age: Int){
}

fun main() {
    var dog1 = Dog("Tito", "German Shepherd", 3)
    println(dog1.name + " " + dog1.age + " " + dog1.breed)

     var dog2 = Dog("Bob", "Pitbull", 4)
    println(dog2.name)
    println(dog2.age)
    println(dog2.breed)

     var dog3 = Dog("Yaya","Husky", 1)
    println(dog3.name)
    println(dog3.age)
    println(dog3.breed)
}