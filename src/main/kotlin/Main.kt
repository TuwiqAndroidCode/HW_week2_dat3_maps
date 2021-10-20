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



println("--------------------")

//Exstra Question


    for (i in 1..9){

        print("1 X $i = ${1 * i} \t")
    }
    print("\n")
    for (i in 1..9){

        print("2 X $i = ${2 * i} \t")
    }
    print("\n")
    for (i in 1..9){

        print("3 X $i = ${3 * i} \t")
    }
    print("\n")
    for (i in 1..9){

        print("4 X $i = ${4 * i} \t")
    }
    print("\n")
    for (i in 1..9){

        print("5 X $i = ${5 * i} \t")
    }
    print("\n")
    for (i in 1..9){

        print("6 X $i= ${6 * i} \t")
    }
    print("\n")
    for (i in 1..9){

        print("7 X $i= ${7 * i} \t")
    }
    print("\n")
    for (i in 1..9){

        print("8 X $i= ${8 * i} \t")
    }
    print("\n")
    for (i in 1..9){

        print("9 X $i = ${9*i} \t ")
    }
}