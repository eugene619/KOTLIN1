fun main() {
    var languages = arrayOf("Kotlin", "Python", "Java")
    println(languages[1])

    //Reassigning a value
    languages[1] = "C++"
    println(languages[1])

    //Adding a new element
    var all = languages.plus("PHP")

    for (lang in all){
        println(lang)
    }

    //Size of an array
    println(languages.size)
}