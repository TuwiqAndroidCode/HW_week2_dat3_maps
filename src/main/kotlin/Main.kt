fun main(args: Array<String>) {

    // ----------------------------------------------------------------- //
                       // HomeWork Part 1 //
    val mapOfCountries = mutableMapOf("SA" to "Saudi Arabia",  "US" to "United State", "CAN" to "Canada")      // create a map
    mapOfCountries.putAll(setOf("UK" to "United Kingdom", "JA" to "Japan"))     // add sets of data to map
    mapOfCountries.replace("UK", "Uk")          // replace value to be UK
    mapOfCountries.remove("JA")             // remove the key JA with its value
    println(mapOfCountries)                     // print the map
    println("------------------------------------------------------")



    // ----------------------------------------------------------------- //
                        // HomeWork Part 2 //

    val mapOfPhones = mapOf(1 to "Samsung",  2 to "Apple", 3 to "Huawei").toMutableMap()        // create a map
    mapOfPhones.putAll(listOf("HTC", "Nokia", "Sony").mapIndexed { index,item -> index+4 to item })     // add list to map
    println(mapOfPhones)        // print the map

}