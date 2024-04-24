//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    passExam(66)
    shipping(1.8)
    shipping(9.0)
    shipping(8.6)
    arithmetic(79)
    calculation(-9)
    calculation(56)
val account=Account("faith",2.5)
    account.depositMoney(7.5)
    account.withdrawMoney(8.9)

//println(arithmetic(arrayOf(10,20,30,40,50).contentToString()))
    println(volume(5,3.14159))
    volume2(5)
    println(isPalindrome("madam"))
    println(checkPalindrome("kayak"))
    println(reverseString("faith"))
    println(lengthOfLastWord("I love coding"))
    println(lengthOfLast("I love coding"))
    println(arithmetic(arrayOf(10,20,30,40,50)).contentToString())
    println(lastWordLength("Heavy rains expected"))
    multiples()
}
//create a program that determines if a student has passed an exam based on their score.passing score is 60
fun passExam(num:Int){
    if(num<60){
        println("fail")
        }
    else{
        println("pass")
    }
}
//program that calculates the cost of shipping based on weight of package.if weight is less or equal to 2kg,cost is $5.
//if weight is greater than 2kg but less or equal to 5kg,cost is $10.For weights above 5kg,cost is $15.
fun shipping(weight:Double) {
    if (weight <= 2) {
        println("cost is $5")
    }
    else if (weight > 2 && weight <= 5){
    println("cost is $10")
    }
    else{
        println("cost is $15")
    }
}

//create a program that takes a string as input and counts the occurrences of each character in it
fun countOccurrences(str: String, ch: Char): Int {
    var count = 0

    for (element in str) {
        if (element == ch) {
            count++
        }
    }

    return count
}
//write a program that takes an integer as input and checks it its odd number
fun arithmetic(num:Int) {
    if (num % 2 == 0) {
        println("even")
    }
   else{
       println("odd")
    }
}
//program that checks if number is positive,negative or zero and prints the result accordingly
fun calculation(num:Int){
    if(num<0){
        println("negative")
    }
    else if(num>0){
        println("positive")
    }
    else{
        println("zero")
    }
}

//class called Account to represent a bank account .IIt should have properties for balance and owners name.
//include methods for depositing and withdrawing money.
class Account(var name:String,var balance:Double){
    fun depositMoney(deposit:Double){
        balance=0.0
        balance+=deposit
        println("You have deposited $deposit million shillings and your balance is $balance")
    }
    fun withdrawMoney(withdraw:Double){
           balance-=withdraw
        if (balance<=withdraw){
            println("insufficient balance")
        }
        else{
            println("you have withdrawn $withdraw balance is $balance")
         }
       }
      }
//
fun arithmetic(num:Array<Int>):Array<Any>{
    return arrayOf(num.sum(),num.count(),num.average())
}
//The volume of a sphere is calculated using the formula below //V = 4/3 π r //3 .Write and invoke a function that is capable of accurately calculating the
//volume of any sphere given its radius. Use 3.14159 as π
fun volume(radius:Int,pie:Double):Double{
    return radius*radius*radius*pie*4/3
}
fun volume2(radius:Int){
    val pie = 3.14159
    val result = pie*radius*radius*radius*4.0/3
    println(result)
}

//A palindrome is a string that reads the same forwards and backwards e.g madam, wow, kayak. Write and invoke a function:
//isPalindrome(word: String): Boolean that takes in a single word and returns true or false depending on whether the
//word is a palindrome.
fun isPalindrome(str: String): Boolean {
    var start = 0
    var end = str.length - 1
    while (start < end) {
        if (str[start] != str[end]) {
            return false
        }
        start++
        end--
    }
    return true
}

fun checkPalindrome(word:String):Boolean {
    val reversedWord = word.lowercase().reversed()
    if (word == reversedWord){
        return true
}
else {
    return false
    }
}


fun reverseString(name:String):String{
    val charArray = name.toCharArray()
    var left =0
    var right = charArray.size-1
    while(left<right){
        val temp = charArray[left]
        charArray[left] = charArray[right]
        charArray[right]=temp
        left++
        right--
    }
    return String(charArray)

}
//write a function that takes in a sentence comprised of different words and spaces and returns the length of the last word

//method1
fun lengthOfLastWord(sentence: String): Int {
    var result = 0
    for (i in sentence.length - 1 downTo 0) {
        if ((sentence[i].toString() == " " && result == 0)) continue

        if (sentence[i].toString() == " " && result != 0) break
        result++
    }
    return result
}
//method2
fun lengthOfLast(name3: String):Int {
    var newWord = name3.split(" ")
    var a = newWord.last().length

    return a
}
//method3
fun lastWordLength(word2:String):Int {
    var len = 0
    var idx = word2.trim().lastIndex
    while (idx >= 0) {
        if (word2[idx] != ' ') {
            len++
        } else {
            break
        }
    idx--
}
return len

}

//write a function that prints out the multiples of 8 and 6 between 1 and 1000.for multiples of both 8 and 6
//it should print out 'bingo'
fun multiples() {
    for (numbers in 1..1000) {
        if (numbers % 8 == 0 && numbers % 6 == 0) {
            println("bingo")
        } else if (numbers % 6 == 0) {
            println("number")
        } else if (numbers % 8 == 0) {
            println("numbers")
        } else {
            println("skip")
        }
    }
}