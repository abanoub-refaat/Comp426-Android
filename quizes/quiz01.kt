open class Vehicle (val brand: String, var speed: Int){
    open fun displayInfo(){
        println("brans is ${brand}, and the speed is ${speed}")
    }
}

class Car(val newBrand: String, val newSpeed: Int): Vehicle (newBrand, newSpeed){
    private var fuelLevel: Int = 0
        get() = fuelLevel
        set(value){
            if(value > 100){
                println("invalid value")
            } else if (value < 0){
                println("invalid value agein!")
            } else {
                field = value
            }
         }

    override fun displayInfo(){
        println("brand is $brand, speed is $speed, and fuelLevel is $fuelLevel")
    }

    constructor(newBrand: String): this(newBrand,100){
        fuelLevel = 100
    }
}

class User (var name: String? ,var age: Int?) {

    fun greet(){
        println("hello, ${name ? "guest"}")
    }

    fun canVote(): Boolean{
        return age!! >= 18
    }
}

fun main(){
    val myCar = Car("car1", 200)
    val myNewCar = Car("car2")

    val myUser = User("Abanoub", 21)
    println(myUser.canVote())
    println(myUser.greet())

    myUser.age = null
    myUser.name = null

    println(myUser.canVote())
    println(myUser.greet())

    print(myCar)
}