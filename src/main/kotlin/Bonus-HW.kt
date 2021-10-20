fun main() {



    for (row in 1..readLine()!!.toInt()) {
        for (col in 1..row){
            print("1*$col ")
        }
        println(" ")
    }

}
fun  testArray( ): Array<Array<Int>>{
    val numberArray  = Array(5) {
        Array(5) { 0 }
    }
    for(row in 0..4){
        for (col in 0..row){
            numberArray[row][col]=1
        }
    }
    return numberArray
}
