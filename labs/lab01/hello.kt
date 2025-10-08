// introduction to kotlin programming
fun main(){
    println("hello, world!")
    val pi:Double = 3.14
    var count:Int = 4
    println("the current count is: ${count} and can be changed later!")
    println("pi is ${pi} and we cannot change it later!")
    count = 5
    println("the new count is: ${count}")
    

    val nextMeeting = "Next meeting:"
    val date = "January 1"
    val reminder = nextMeeting + " " + date
    println(reminder)

    println("the count before running the function: ${count}")
    count = increaseCount(count)
    println("the count is now: ${count}")
}

fun increaseCount(count:Int): Int{
    var cnt =count+1
    return cnt
}