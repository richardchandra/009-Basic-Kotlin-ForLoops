fun main(args: Array<String>) {
    //For looping
    //For every value in a array
    val names = arrayOf("Eko", "Budi", "Charlie")

    var iteration = 0
    for(name in names){
        println(name)
        iteration ++
    }
    println("Iterate for $iteration times")

    //For range
    for(value in 0..10){
        println(value)
    }

    for(value in 10 downTo 0 step 2){
        println(value)
    }


}