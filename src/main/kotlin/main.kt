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
}