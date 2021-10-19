fun main (args: Array<String>) {


// ============= part I ==============
        val infoMap = mutableMapOf("Name" to "Abdullah", "SeName" to "Mohammed", "LaName" to "ALSMARI")
        infoMap.put("ID", "12903")
        println(infoMap)
        infoMap["ID"] = "100000"
        infoMap.remove("SeName", "Mohammed")
        println(infoMap)
// ============= part II ==============
        val MyFamily = mutableMapOf("Mam" to "Sara", "Dad" to "Mohammed", "BigBrother" to "Salman")
        MyFamily.putAll(listOf("Me" to "Abdullah", "Sister" to "Nada", "Turtle" to "emmy"))
        println(MyFamily)
        //================Q1 Pouns====================
        println("Enter Number ")
        val StopAt = readLine()!!.toInt()
        for (i in 0..StopAt) {
                for (S in 1..i) {
         print("$S*$StopAt") }
         println()
        }
}









