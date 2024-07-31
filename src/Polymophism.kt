//Parent Class
open class Shape{
    open fun draw(){
        println("Drawing a shape")
    }
}

//Child Classes
//The 'draw' function is borrowed from the ParentClass but it should be overridden when printing the ChildClasses
class Rectangle: Shape(){
    override fun draw(){
        println("Drawing a rectangle")
    }
}

class Circle: Shape(){
    override fun draw(){
        println("Drawing a circle")
    }
}

fun main() {
    var myshape = Shape()
    myshape.draw()

    var myrectangle = Rectangle()
     myrectangle.draw()

    var mycircle = Circle()
     mycircle.draw()

}

