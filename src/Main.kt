//Qn1. Write a Kotlin function named isEven that takes an integer as a parameter and returns a Boolean indicating whether the number is even or odd.
//Qn2.Write a Kotlin function that changes the value of Kibaki to Ruto in this sentence “Kibaki was the second president of Kenya”
//Qn3.Create one function that is the given below array:
// var numbers=  arrayOf(32, 17,4, 213, 78, 43, 90,31, 3, 73, 11, 158, 62)

//a.print out the sum of the second and 5th elements
//b.prints out the index of 158
//c.prints out the elements in ascending order

//Qn4.Create a Kotlin function that extracts a substring from a given string starting from index 2 to index 5 using the slice function and returns it.
//Qn5.Create a function that takes in 3 names and returns a string array taking all 3 names
//Qn6.Write a Kotlin program to check if a given number is divisible by seven.
//Qn7.Write a function that takes in 2 parameters, name and age and returns a String with this structure "Hi, my name is x and I am y years old." Where x and y are the provided name and age respectively.
//Qn8.How old will I be next year if I'm currently 22(solve using kotlin functions and operations)
//Qn9.Write a function that takes in a name and prints out "That's me!" when your name is passed to it, otherwise it prints out "I don't know who that is"
//Qn10.Implement a kotlin program that declares the variable of a temperature of type double and assigns it a temperature value. Then print a message saying "The temperature is [temperature] degrees celcius
//Qn11.
fun main() {

    //Qn1.
    isEven(2)

    //Qn2
    println(changeName("Kibaki was the second president of Kenya" ))

    //Qn3.a
    var numbers=  arrayOf(32, 17,4, 213, 78, 43, 90,31, 3, 73, 11, 158, 62)
    println(numbers[1] + numbers[5])

    //Qn3.b
    println(numbers.indexOf(158))

    //Qn.c
    var sortedNumbers = numbers.sortedArray()
    println(sortedNumbers.contentToString())

    //Qn4
    var names="Pearl"
    var slicing = names.slice(2 .. 4)
    println(slicing)

    //Qn6
    division(42)

    //Qn7
    sentence("Pearl", 23)



    //Qn9
    myName("Cheshari")

    //Qn10
    temperature(20.43)
}



//Qn.1
fun isEven(y: Int): Boolean{
    var y = 2
    if (y%2 == 0){
        return true
    }
    else{
        return false
    }
}

//Qn2
fun changeName(name:String) :String {
    return name.replace("Kibaki", "Ruto")
}

//Qn5
fun names(a: String, b: String, c: String): String {
    var names: Array<String> = arrayOf(a, b, c)
    return names.contentToString()
}


//Qn.6
fun division(number:Int){
    if (number %9 == 0) {
        println("Divisible by 9.")
    }
    else {
        println("Not divisible by 9.")
    }
}


//Qn.7
fun sentence(name:String, age:Int): String {
    var sentence = "Hi my name is $name and I am $age years old."
    return sentence
}




//Qn.9
fun myName(name: String) {
    if (name == "Gloria") {
        println("That's me!")
    } else {
        println("I don't know who that is.")
    }
}

//Qn.10
fun temperature(temp: Double) {
    println("The temperature is $temp degrees Celcius")

    //New Questions

    text("Pearl", "Nairobi")
    sentence("Good morning")
    nums (arrayOf(10,20,30,40,50))

}


//New Questions
//write a function taking in parameters, name and city and return a string with the sentence 'I am x and I live in y city, where x and y are provided respectively

fun text(name:String, city:String){
    var sentence=( "I am $name and I live in $city city.")
    println(sentence)
}

//Write a function that extracts a substring from a given string starting from index 4 to index 6 using the slice function and return it
fun sentence (word: String):String{
    return word.slice(4..6)

}

//Write a program that reads in a list of integers and finds the maximum and minimum values in the list.

fun nums(numbers:Array<Int>){
    println(numbers.minOrNull())
    println(numbers.maxOrNull())
}