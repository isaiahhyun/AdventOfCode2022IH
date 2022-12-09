fun main()
{
    val input = readInput("Day03")
    //println("Biggest Sum: ${findBiggestSum(input)}")
    //println("Score: ${calculateScoreP2(input)}")
    println("Sum: ${findDoubleOccurance(input)}")

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
    var score = 0
    for(i in input.indices){
        val h = input[i].substring(0,1).lowercase()
        val j = input[i].substring(2).lowercase()
        if((h=="a" && j == "y")||(h=="b" && j =="z")||(h=="c" && j == "x"))
        {
            score+= 6
        }
        else if((h=="a" && j =="x")||(h=="b"&& j=="y")||(h=="c"&&j=="z"))
        {
            score += 3
        }

        if(j=="x")
        {
            totalScore++
        }
        else if(j =="y")
        {
            totalScore+=2
        }
        else if(j=="z")
        {
            totalScore+=3
        }
    }
    return (score+totalScore)

}
fun calculateScoreP2(input: List<String>) : Int {
    var totalScore = 0
    var score = 0
    for(i in input.indices)
    {
        val h = input[i].substring(0,1).lowercase()
        val j = input[i].substring(2).lowercase()
        if(j == "y")
        {
            totalScore += 3

            if(h == "a")
            {
                score++
            }
            else if(h =="b")
            {
                score+=2
            }
            else if(h =="c")
            {
                score+=3
            }
        }
        if(j == "z")
        {
            totalScore+= 6
            if(h == "a")
            {
                score+= 2
            }
            else if(h =="b")
            {
                score+=3
            }
            else if(h =="c")
            {
                score++
            }

        }
        if(j == "x")
        {
            if(h == "a")
            {
                score+= 3
            }
            else if(h =="b")
            {
                score++
            }
            else if(h =="c")
            {
                score+=2
            }
        }

    }
    return (totalScore+score)
}
fun findDoubleOccurance(input: List<String>):Int{
    var total = 0
    var count = 0
    var countPlace = Int.MAX_VALUE
    var alphabet = listOf("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t"
            ,"u","v","w","x","y","z")
    var alphabetCaps = listOf("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S",""
            ,"U","V","W","X","Y","Z")
    for(i in input.indices)
    {
        val h = input[i].length/2
        val firstHalf = input[i].substring(0,h)
        val secondHalf = input[i].substring(h)
        for(i in 0 until h-1)
        {
            if(secondHalf.contains(firstHalf.substring(i,i+1)) && countPlace == 0)
            {
                countPlace = 1
                if(firstHalf.substring(i,i+1).lowercase() == firstHalf.substring(i,i+1))
                {
                    for(x in 0 until 25)
                    {
                        count++
                    if(firstHalf.substring(i,i+1) == alphabet[x])
                    {
                        total+=count
                    }
                    }
                    count = 0

                }
                if(firstHalf.substring(i,i+1).lowercase() != firstHalf.substring(i,i+1))
                {
                    count = 26
                    for(x in 0 until 25)
                    {
                        count++
                        if(firstHalf.substring(i,i+1) == alphabetCaps[x])
                        {
                            total+= count
                        }
                    }
                    count = 0
                }

            }
        }
        countPlace = 0
    }
    return total
}