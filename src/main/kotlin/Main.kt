fun main(args: Array<String>) {



//part1
    var newMap=mutableMapOf('A' to "Renad",'B' to "Roa", 'C' to "Abdullah",'D' to "Maha")
    newMap+='E' to "Ali"
    //or
    newMap.put('C' , "Hajer")
    newMap['A']="Huda"
    newMap.remove('C' )
    println(newMap)
    newMap.clear()//remove all elements
    println(newMap)

//part2
    var studentMap=mutableMapOf(4 to "Renad", 6 to "Khalid", 5 to "Ali")
    var newlist= mutableListOf("jojo","hala","sara")
    studentMap.putAll(newlist.mapIndexed { index, s ->index to s  })
     println(studentMap)
    //or
    var  studentMap2=mutableMapOf("1" to "Renad", "2" to "Khalid","3" to "Ali")
    var newlist2= mutableListOf("jojo","hala","sara")
    studentMap2.putAll(newlist.map { it to it })
    println(studentMap2)

    //The bonus
    var x=5
    for(i in 0..x){
        for(j in 1..i){
            print("$j*$x="+(j*x)+" ")
        }
        println()
    }


}