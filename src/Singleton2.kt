class A{
        init {
            println("Class init method. Singleton name property")
        }


    }

    object Singleton2{
        init {
            println("Singleton class invoked")

        }
        var name = "Kotlin Objects"
        fun printName(){
            println(name)
        }
    }



fun main(args: Array<String>) {
    var a = A()
}