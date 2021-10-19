fun main(args: Array<String>) {


// *** Part 1 ***

    var numbersMap=mutableMapOf(1 to "First",2 to "Second",3 to "Third",4 to "Fourth" )
    numbersMap.put(5 , "Fifth")
    numbersMap.putIfAbsent(6,"Sixth")
    numbersMap.putAll(mapOf(7 to "Seventh",8 to "Eighth"))
    numbersMap[1]="1st"
    numbersMap.replace(2,"2nd")
    numbersMap.remove(8)
    println(numbersMap)



}