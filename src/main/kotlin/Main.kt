fun main(args: Array<String>) {

//    Part I
// Create a map with 4 elements
    val MapOfPlaces = mutableMapOf("Places1" to "Resturant","Places2" to "Home","Places3" to "Mall","Places4" to "Park")
    println("The Original Map : $MapOfPlaces")
// add element
    MapOfPlaces.put("Places5", "Cinema")
    println("The Map after added: $MapOfPlaces")
// edit elements
    MapOfPlaces["Places3"] =  "beach"
    println("The Map after update value of Places3 : $MapOfPlaces")
// remove elements
    MapOfPlaces.remove("Places5")
    println("The Map after remove value : $MapOfPlaces")

    println("=================================================================")

    //Part II
    //Create a map of 3 elemnts
    val MapOfOddNumbers = mutableMapOf(1 to 1,3 to 3,5 to 5)
    println("The Original Map of Odd Numbers: $MapOfOddNumbers")
    // create 3 elements of list
    val AddToOddMapList = mutableListOf(7, 8, 9)
    println("The list of Odd Numbers: $MapOfOddNumbers")
    // add the list to the map
    for (i in 0 .. AddToOddMapList.size-1)
    MapOfOddNumbers.put(AddToOddMapList.get(i), AddToOddMapList.get(i))

    println("The Map of Odd Numbers with list value: $MapOfOddNumbers")
}// end main

