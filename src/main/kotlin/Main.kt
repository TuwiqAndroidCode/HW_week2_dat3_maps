fun main(args: Array<String>) {

        //ex1===========================================================================================
/*
    var myMap = mutableMapOf("haya" to "alrawdhan","hessah" to "alsaad", "reem" to "alhajri")//create map
    println(myMap)
    myMap.putIfAbsent("raghad","alghamdi") //add element
    println(myMap)
    myMap["hessah"]="afrah" //edit element
    println(myMap)
    myMap.remove("hessah") //remove element
    println(myMap)
    */


        //EX2=============================================================================================

        /*  var familyMap = mutableMapOf("father" to "saud","mather" to "jameelah", "sun" to "abdullah")//create map
          familyMap.putAll(listOf("reem" , "ali", "abdulrahman").mapIndexed{index, s -> index.toString() to s }) //create list 3 element and add it to map
          println(familyMap)*/




        //option qustion====================================================================================:)

        var n=5
        var x=1

        while (x <= n) {
            var y=1
            while (y<=x){

                print("$y*5 ")
                y++
            }
            println()
            x++
        }

    }



