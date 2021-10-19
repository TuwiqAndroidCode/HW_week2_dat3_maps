fun main() {

// part I =============================================
 
  var map1 = mutableMapOf("room1" to "A", "room2" to "B", "room3" to "C", "room4" to "D")
 
  map1.putIfAbsent("ketion","E")
    map1.remove("room2")
  println(map1)
 

// part II ===========================================

    var map2 = mutableMapOf("Section1" to "IT", "Section2" to "Admin", "Section3" to "Finance")

    map2.putAll(listOf("programmer","director","accountent").mapIndexed { index,item -> index.toString() to item })

    println(map2)
}