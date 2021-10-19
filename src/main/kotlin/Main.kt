fun main(args: Array<String>) {


// Part I
val NorasFavoriteStuff = mutableMapOf("drama" to "vincenzo the mafia man" ,
    "animation" to "attack on titan",
    "animal" to "cat",
    "bff" to "khloud")
println(NorasFavoriteStuff)
//add new element
    NorasFavoriteStuff["Qusine"]= "italian"
    //edit
    NorasFavoriteStuff.put("drama" , "are you a human too")

    //delete
    NorasFavoriteStuff.remove("Qusine")
     println(NorasFavoriteStuff)

  //Part II

    val toWatch = mutableMapOf(1 to "one woman" , 2 to "The Veil" , 3 to "Dali And Cocky Prince")
    //add list
    toWatch.putAll(listOf(4 to "kill it", 5 to "Hometown Cha-Cha-Cha" , 6 to "lost"))
    println(toWatch)
}