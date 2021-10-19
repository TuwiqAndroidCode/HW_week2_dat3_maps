//Part I===================================================================================
fun main() {
//Create a map with 4 elements
    val favoAnimeChar= mutableMapOf("Kakash" to "Naruto", "Levi" to "Attack On Titan", "Hanametchi" to "Slam Dank")
    println(favoAnimeChar)
// add new char
    favoAnimeChar.put("Kelwa","Hunter X Hunter")
    println(favoAnimeChar)
// edit
    favoAnimeChar["Kelwa"] = "HunterXHunter"
    println(favoAnimeChar)
// remove
    favoAnimeChar.remove("Hanametchi")
    println(favoAnimeChar)
//Part II===================================================================================
//Create a map of 3 elemnts
    val  myInterests =mutableMapOf(1 to "Orchid",2 to "Indian Jasmine" , 3 to "Sunflower")
// create 3 elements of list & add the list to the map
    myInterests.putAll(listOf(4 to "Coding",5 to "Drowing",6 to "Cats"))
    println(myInterests)
}