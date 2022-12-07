fun main()
{
    val input = readInput("Day01")
    println("Biggest Sum: ${findBiggestSum(input)}")
}

fun sumAllNums(input : List<String>): Int{
  //  var total = 0

 //   for(num in input){
   //     total+= num.toInt()
 //   }
   // return total

    return input.map { it.toInt() }.sum()
}
fun findMin(input: List<String>) : Int
{
    //for(inti = 0; i < input.size; i++) java
    // for(i in 0..input.size-1) kotlin
    // for(i in 0 until input.size) kotlin
    return input.map{it.toInt()}.min()
}
fun findTwoSmallest(input : List<String>) : Int {
    val sorted = input.map { it.toInt()}.sorted()
    sorted.take(2)
    return  input.map{it.toInt()}.sorted().take(2).sum()
    //return sorted[0] + sorted[1]
}
fun countWords(input: List<String>): Int{
    var wordCount = 0
    for(line in input){
        wordCount+= line.split(" ").size
    }
    return wordCount

}
fun countHWords(input: List<String>) : Int{
    var count = 0
    return count
}
fun findBiggestSum(input: List<String>): Int {
    var total = 0
    var biggest = 0
   for(i in input.indices)
    {
        if(input[i] == "")
        {
            if(total > biggest && total < 68996) {
                biggest = total
            }
            total = 0
        }
        else {
            total += input[i].toInt()
        }
    }
    return biggest

}
fun calculateScore(input : List<String>) : Int{
    var totalScore = 0
    val y = 2
    val x = 1
    val z = 3
}