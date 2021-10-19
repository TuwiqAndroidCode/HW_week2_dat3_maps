fun main(args: Array<String>) {


    //Create a map with 4 elements with add, edit and remove

    var firstMap = mutableMapOf( 1 to "Raghad" , 2 to "Sara" , 3 to "Ramah" , 4 to "Reem" )

    //add
    firstMap[5] = "Nora"
    //edit
    firstMap[4] = "Nuha"
    //remove
    firstMap.remove(2)

    println(firstMap)


    //Create a map of 3 elemnts and create 3 elements of list add the list to the map

    var secondMap = mutableMapOf( 1 to "Math" , 2 to "English" , 3 to "Arabic")

    secondMap.putAll(listOf( 4 to "Computer",5 to "Science", 6 to "Quran"))

    println(secondMap)

}