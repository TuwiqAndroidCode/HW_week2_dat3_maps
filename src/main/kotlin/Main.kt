fun main(args: Array<String>) {
    //Q1 Part 1
    var meMap = mutableMapOf<String,String>("Dr." to "Amal","Eng." to "Sara","T." to "Ali") //Create a map from 3 elements
    println(meMap) // For adding to map write
    meMap.putIfAbsent("Pro","Ahmed") //Add to map
    println(meMap)
    meMap["Pro"]="Ragad" //edit the value from the key
    println(meMap)
    meMap.remove("T.") // remove  the value T.Ali
    println(meMap)


    //--------------------------------------------------------------------------
    //Part 2
    var meMap2 = mutableMapOf<Int,String>(3 to "Food", 4 to "Soda", 5 to "Snacks") // Create a map from 3 elements
    meMap2.putAll(listOf("Apple","Juice","Chips").mapIndexed{index, item -> index.toInt() to item}) // Create a list of 3 elements and add it to map
    println(meMap2)
}