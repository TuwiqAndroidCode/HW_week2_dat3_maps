fun main(args: Array<String>) {
//part|
var mapLamia = mutableMapOf<String,String>(
    "In1" to "Lamia" , "In2" to "Omar" , "In3" to "Huda" , "In4" to "Shayam" )
    println(mapLamia)
//ADD
    mapLamia.put("In5" , "Ghaida")
    println(mapLamia)
//EDIT
    mapLamia["In4"]="Maryam"
    println(mapLamia)
//remove
    mapLamia.remove("In5")
    println(mapLamia)

    println("----------------------------------")

//part||
    var mapList = mutableMapOf<String,String>(
        "Inst1" to "Kotlin" , "Inst2" to "Java" , "Inst3" to "C++")
    println(mapList)
    mapList.putAll(listOf("Swift", "PHP" , "Python").mapIndexed({x, y -> x.toString() to y }))
    println(mapList)

    println("-------------------------------")

    var i = 5
    var j = 1
    for(i in j..i){
        for(j in j..i) {
            print("1 X $j - ") }
        println()
        j=+1 }




}