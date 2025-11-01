fun main(){
    // we did not use the () becouse we want to store the variable not to call the function.
    val trickFunctionBefore = ::trick // reference operator
    val trickFunctionCalled = trick()

    val trickLamda = trickLamda
    trickLamda()

    treat()

    println("\n------- BREAK LINE --------\n")

    // Trick or Treat function
    val coins: (Int) -> String = {
        // quantity -> "$quantity quarters"
        "$it quarters"
    }

    // val treatFunction = trickOrTreat(false, coins)
    // treatFunction()

    val trickFunction = trickOrTreat(true, null)
    val treatFunction2 = trickOrTreat(false) {"$it quarters!"}
    
    repeat(4) {
        treatFunction2()
    }
    trickFunction()


}

fun trick(){
    println("No treats!")
}

val trickLamda = {
    println("No treats! but lambda")
}

val treat: () -> Unit = {
    println("Have a treat!")
}

// a function is a datatype so we can use it as any other datatype (higher-order function)
fun trickOrTreat (
        isTrick: Boolean, 
        extraTreat: ((Int) -> String)?): () -> Unit 
    {
        if(isTrick) {
            return ::trick
        } else {
            if(extraTreat != null){
                println(extraTreat(5))
            }
            return treat
        }
}