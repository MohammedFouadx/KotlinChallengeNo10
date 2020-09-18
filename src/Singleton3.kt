class A3{

    init {
        println("Class init method")
    }

    object SingletonA{

        init {

            println("SingletonA class invoked")
        }

        var name = "Kotlin Objects A"
        fun printName(){
            println(name)
        }
    }

    companion object SingletonB  {

        init {
           println("SingletonB class invoked")
        }

        var name = "Kotlin Objects B"
        fun printName(){
            println(name)
        }

    }

}

fun main(args: Array<String>) {
    var a = A3()
    var aa = A3.name
    A3.name = "Kotlin Tutorials"
    A3.printName()
}