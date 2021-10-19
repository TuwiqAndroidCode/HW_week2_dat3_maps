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
    // *** Part 2  ***

    var lettersMap= mutableMapOf('A' to "letter a",'B' to "letter B",'C' to "letter c")
    lettersMap.putAll(listOf("letter E","letter F").mapIndexed{ index,item -> index.toChar() to item })
    println(lettersMap)
    // ***  Bounce ***
    var x=5
    for(num1 in 1..x){
        for(num2 in 1..num1)
        {
            print("$num2*$num1=${num1*num2}\t")
        }
        println()
    }

}