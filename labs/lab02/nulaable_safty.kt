fun main(){
    var x: String?
    x = null
    println(x?.substring(1, 5))

    var y: String?
    y = "not null value"
    println(y!!.substring(1,5))
}