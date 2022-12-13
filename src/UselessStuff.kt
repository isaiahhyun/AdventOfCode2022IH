fun main()
{
    val input = readInput("Day04")
    println("Pairs: ${findPairs(input)}")
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
fun countPriorities(input : List<String>):Int{
    var countScore = 0
    var hasBeenFound = false
    var storedValue = ""
    for(i in input.indices)
    {
        var b = input[i].toCharArray()
        var h = (input[i].length)/2
        var secondHalf = input[i].substring(h)
        //println(secondHalf)
        for(x in 0 until h)
        {
            if(b[x].toString() != storedValue)
            {
                if(secondHalf.contains(b[x].toString()))
                        {
                            storedValue = b[x].toString()
                            if(b[x].toString().lowercase() == b[x].toString())
                            {
                                var y = (b[x].code - 96)
                                countScore += y
                            }
                            else
                            {
                                var y = (b[x].code - 38)
                                countScore+= y
                            }

                        }
            }
        }
        storedValue = ""
    }
    return countScore
}
fun findBadge(input: List<String>):Int{
    var count = 0
    var countScore = 0
    var string1 = ""
    var string2 = ""
    var string3 = ""
    var storedValue = ""
    for(i in input.indices)
    {
        if(count == 0)
        {
            string1 = input[i]
            count++
        }
        else if(count == 1)
        {
            string2 = input[i]
            count++
        }
        else if(count == 2)
        {
            string3 = input[i]
            count++
            var x = string2
            var y = string1.toCharArray()
            var z = string3
            var h = string1.length
            for (m in 0 until h)
            {
                if(y[m].toString() != storedValue)
                if((x.contains(y[m].toString())) && (z.contains(y[m].toString())))
                {
                    storedValue = y[m].toString()
                    if(y[m].toString().lowercase() == y[m].toString())
                    {
                        var j = (y[m].code - 96)
                        countScore += j
                    }
                    else
                    {
                        var j = (y[m].code - 38)
                        countScore+= j
                    }
                }
            }
            storedValue = ""
        }
        else if(count == 3)
        {
            string1 = input[i]
            count = 1
        }
    }
    return countScore
}

fun findPairs(input: List<String>) : Int {
    var countPairs = 0
    for(i in input.indices)
    {
        var first = input[i].substring(0,input[i].indexOf(","))
        var second = input[i].substring(input[i].indexOf(",")+1)
        var startFirst = first.substring(0,first.indexOf("-"))
        var startSecond = second.substring(0,second.indexOf("-"))
        var endFirst = first.substring(first.indexOf("-")+1)
        var endSecond = second.substring(second.indexOf("-")+1)

        if(startFirst == startSecond && endSecond == endFirst)
        {
            countPairs++
        }
        else if(startFirst == startSecond || endSecond == endFirst || endFirst == startSecond || startFirst == endSecond)
        {
            countPairs++
        }
        else if(startSecond.toInt() > startFirst.toInt() && startSecond.toInt() < endFirst.toInt())
        {
            countPairs++
        }
        else if(startFirst.toInt() > startSecond.toInt() && startFirst.toInt() < endSecond.toInt())
        {
            countPairs++
        }
        else if(endSecond.toInt() > startFirst.toInt() && endSecond.toInt() < endFirst.toInt())
        {
            countPairs++
        }
        else if(endFirst.toInt() > startSecond.toInt() && endFirst.toInt() < endSecond.toInt())
        {
            countPairs++
        }
        else if((endFirst.toInt()-startFirst.toInt()) > (endSecond.toInt()- startSecond.toInt()))
        {
            if((endSecond.toInt() <= endFirst.toInt())&& startSecond.toInt() >= startFirst.toInt())
            {
                countPairs++
            }
        }
        else if((endFirst.toInt()-startFirst.toInt()) < (endSecond.toInt()- startSecond.toInt()))
        {
            if((endSecond.toInt() >= endFirst.toInt())&& startSecond.toInt() <= startFirst.toInt())
            {
                countPairs++
            }
        }
    }
    return countPairs
}
fun secretMessage (input: List<String>): String{
    var first = listOf("F","T","C","L","R","P","G","Q")
    var two = listOf("")
    var three = listOf("")
    var four = listOf("")
    var five = listOf("")
    var six = listOf("")
    var seven = listOf("")
    var eight = listOf("")
    var nine = listOf("")
    for(i in 11 until 511)
    {
return ""
    }
    return ""
}
