fun main(args: Array<String>) {


// your code here
//H.W part1


    var mymap= mutableMapOf("door" to "key" , "car" to "drive" , "hand" to "catch" , "leg" to "move")
    mymap["book"] = "read"
    println(mymap)
    mymap["door"] = "lock"
    println(mymap)
    mymap.remove("leg")
    println(mymap)



    //=====================
    //part2
    var newmap = mutableMapOf(1 to "khalid" , 2  to "zamel" , 3 to "hussain")
    println(newmap)
    newmap.putAll(listOf("aymen", "rakan", "zaid").mapIndexed{index,name -> index.toInt()to name})
    println(newmap)
    newmap.putAll(mapOf(4 to "aymen" , 5 to "rakan" , 6 to "zaid"))
    println(newmap)
    newmap.remove(0)
    println(newmap)


    //bons question


    var z = 5
    for (y in 1..z){
        for (x in 1..y){
            print("$x*$y ")
        }
        println()
    }






}