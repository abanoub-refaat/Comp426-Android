class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {
    val isPopular: () -> Boolean = {
        playCount >= 1000
    }

    fun songDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}