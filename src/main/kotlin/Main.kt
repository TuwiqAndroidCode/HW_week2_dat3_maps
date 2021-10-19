fun main() {
    //Create a map with 4 elements with add, edit and remove
    var myMap= mutableMapOf(1 to "first", 2 to "second", 3 to "third", 4 to "forth")
    //println(myMap)
    //add
    myMap[5]="fifth"
    //println(myMap)
    //edit
    myMap[1]="1st"
    //println(myMap)
    //remove
    myMap.remove(4)
    //println(myMap)

    println("-------------------------")
    //Create a map of 3 elemnts and create 3 elements of list add the list to the map
    var myMap2= mutableMapOf(1 to "first", 2 to "second", 3 to "third")
    //println(myMap2)
    myMap2.putAll(listOf(4,5,6).mapIndexed(){key,element-> key+4 to element.toString()})
    //println(myMap2)

    println("-------------------------")
    //ENG. Mohamed's question
    //Multiplication

    var input=5
    for(count1 in 1..input){
        for (count2 in 1..count1){
            print("$count2"+"x$input=${input*count2}\t")
        }
        println()
    }
}