fun main(args: Array<String>){
    printHello("Abanoub")
}

fun printHello(name: String = "World"): Unit{
    println("Hello, ${name}!")
}