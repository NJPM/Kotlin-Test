data class Employee(val firstName: String, val lastName: String, val yearsWorked: Int) {
    var fullName = "$firstName $lastName"                   // Data class keep equals/hashCode and toString (e.g. "Employee(firstName="Bob",...
    init {                                                  // Class example. Init will run when an instance is created.
        if (yearsWorked > 1) {
            println("$fullName is eligible for a raise!")
        } else {
            println("$fullName is not eligible for a raise just yet.")
        }
    }
    fun job(task: String) {
        println("It is ${fullName}'s job to do $task.")
    }
}

fun ozToTsp(oz: Double): Double {                           // Function example
    var tsp = oz*6
    return tsp
}

fun main() {
    println("Hello World!")

    var a = 5                                               // Implies type
    val b = 6                                               // Val(ue) is immutable
    println("-- 1st for loop output --")                    // For loop examples
    for (i in 10 downTo 1) {
        println("i = $i")
    }
    println("\n-- 2nd for loop output --")
    for (j in 1 until 10) {
        println("j = $j")
    }
    println("\n-- 3rd for loop output --")
    for (k in 1..10 step 2) {
        println("k = $k")
    }
    val myTasks = setOf(                                    // Use mutableSetOf for a mutable set
            "Eat Breakfast",                                // or listOf, mapOf, etc
            "Clean Up",
            "Work",
            "Eat Lunch",
            "Clean Up",
            "Work",
            "Eat Dinner",
            "Clean Up")
    println("\n-- myTasks Output --")                       // Use index in for loop
    for ((taskIndex, task) in myTasks.withIndex()) {
        println("$taskIndex: $task")
    }

    var tspNeeded = ozToTsp(.75)                            // Call function
    println("You will need $tspNeeded tsp of vanilla extract for this recipe.")

    var perimeter = {side1: Int, side2: Int -> 2*(side1 + side2)}   // Lambda function syntax
    println(perimeter(2,4))

    var theBoss = Employee("Maxie", "Jones", 15)
    theBoss.job("everything")

}