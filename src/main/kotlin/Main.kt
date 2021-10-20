fun main() {
 println("Part I ==============================================================")
//Create a map with 4 elements
    val favoAnimeChar = mutableMapOf("Kakash" to "Naruto", "Levi" to "Attack On Titan", "Hanametchi" to "Slam Dank")
    println(favoAnimeChar)
// add new char
    favoAnimeChar.put("Kelwa", "Hunter X Hunter")
    println(favoAnimeChar)
// edit
    favoAnimeChar["Kelwa"] = "HunterXHunter"
    println(favoAnimeChar)
// remove
    favoAnimeChar.remove("Hanametchi")
    println(favoAnimeChar)
//===================================================================================
println("Part II==============================================================")
// Create a map of 3 elemnts
    val myInterests = mutableMapOf(1 to "Orchid", 2 to "Indian Jasmine", 3 to "Sunflower")
// create 3 elements of list & add the list to the map
    myInterests.putAll(listOf(4 to "Coding", 5 to "Drowing", 6 to "Cats"))
    println(myInterests)
    // ===============================================================================
    println("(Bonus Q1: print Stars)========================================")
    val n = 3
    for (i in 0..n) {
        for (j in 0 until i) {   print("*")      }
        for (k in 0 until n - i) {    print(" ")        }
        println(" ")    }
//===================================================================================
       println("(Bonus Q2:multiplication table of 5)=================================")
    val num1 = 5
    for (i in 1..num1) {
        for (j in 1 .. i) {   print("$j * $i|   ")     }
        println(" ")        }
    println("=============================Finish ================================")

}
