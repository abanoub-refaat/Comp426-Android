fun main(){
    // kotlin keeps track of numbers as primatives, but lets you use them as objects
    println(2.times(3))
    println(2.4.div(2))

    // type casting in kotlin
    val i: Int = 6
    // val b: Byte = i --> this will give type mismatch error.

    println("type casting ${i} into a byte will give us: ${i.toByte()}")

    // conditionals
    val numberOfCups = 30
    val numberOfPlates = 50

    if(numberOfCups  > numberOfPlates){
        println("too many cups!")
    } else {
        println("not enugh cups!")
    }

    // ranges:
    val numberOfStudents = 100
    if(numberOfStudents in 1..100){
        println(numberOfStudents)
    } else {
        println("the number is not valid")
    }

    // when statement
    when(numberOfStudents){
        0 -> println("0")
        in 1..50 -> println("form 1 to 50")
        else -> println("not valid")
    }

    val pets = arrayOf("dog", "cat", "canary")
    for((index,element) in pets.withIndex()){
        print(element + " with index " + index + " - " )
    }

    for(i in 'k' downTo 'a' step 2){
        println(i)
    }

    repeat(3){
        print("this is insides the repeat ")
    }
}