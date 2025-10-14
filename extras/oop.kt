interface Shape {
    fun computeArea() : Double
}

class House(var color: String) {
    val numberOfWindows: Int = 2
    val isForSale: Boolean = false

    fun updateColor(newColor: String): Unit{
        color = newColor
    }
}

// define an extendable class using the `open` keywrod
open class Box(val length: Int, val width: Int = 20, val height: Int = 40){
    init {
        println("A new box is created with length = ${length}")
    }
}

class Circle(val radius: Double) : Shape{
    // overrides the method in the Shape interface.
    override fun computeArea() = Math.PI * radius * radius

    constructor(name: String) : this(1.0) {
        println("in the name constructor")
    }
    constructor(diameter: Int) : this(diameter / 2.0) {
        println("in diameter constructor")
    }
    init {
        println("Area: ${Math.PI * radius * radius}")
    }
}

// defining abstract classes
abstract class Food {
    abstract val kcal: Int
    abstract val name: String
    fun consume() = println("I'm eating ${name}")
}

class Pizza() : Food(){
    override val kcal = 600
    override val name = "Pizza"
}

class Person(var firstName: String, var lastName: String) {
    var fullName: String = ""
        get() = "${firstName} ${lastName}"
        set(value) {
            val components = value.split(" ")
            firstName = components[0]
            lastName = components[1]
            field = value
        }
}

// adding an extension function to the existing Int class
fun Int.isOdd(): Boolean {
    return this % 2 == 1
}

data class Player (val name: String, val score: Int)

fun main(args: Array<String>){
    val myHouse = House("white")
    println(myHouse)

    val box1 = Box(100, 20, 40)
    val box2 = Box(length = 90)
    val box3 = Box(length = 80, width = 40)

    println("${box1} ${box2} ${box3}")
    println("\nBreak\n")

    val c1 = Circle(3)
    val c2 = Circle("new Circle")

    println("\nBreak\n")

    val person = Person("Abanoub", "Refaat")
    println(person.fullName)

    person.fullName = "Bebo Refaat"
    println(person.fullName)

    println("\nBreak\n")

    val newCircle = Circle(3.0)
    println(newCircle.computeArea())

    println("\nBreak\n")

    Pizza().consume()
    println("is 3 odd? ${3.isOdd()}")

    println("\nBreak\n")

    val firstPlayer = Player("Abanoub", 10)
    println(firstPlayer)
}