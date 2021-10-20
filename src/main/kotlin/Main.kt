fun main() {
// part |
    val firstMap = mapOf<Int,Char>(0 to 'a',1 to 'b',2 to 'c',3 to 'd'  ).toMutableMap() // creating map with 4 elements
    firstMap += 4 to 'e' // adding new element
    firstMap[0]= 'g' // editing the first key
    firstMap -= 4 // remove the key and its entry




//    part ||
    val kosaList = listOf("rakan","mohammed","sultan")
    kosaList.mapIndexed{index, item -> index.toString() to item } // puting numbered keys to the list and map it
    val newMAp =   kosaList.mapIndexed{index, item -> index.toString() to item }.toMap()

}