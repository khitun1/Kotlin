
fun main() {
    try {
        println("Input a:");
        val a = readln().toDouble();
        println("Input b:");
        val b = readln().toDouble();
        println("Input c:");
        val c = readln().toDouble();
        when (a) {
            b, c -> println("Impossible")
            in b..c -> println("a between b and c")
            in c..b -> println("a between c and b")
        }
        when (b) {
            a, c -> println("Impossible")
            in a..c -> println("b between a and c")
            in c..a -> println("b between c and a")
        }
        when (c) {
            a, b -> println("Impossible")
            in a..b -> println("c between a and b")
            in b..a -> println("c between b and a")
        }
    } catch (e: Exception) {
        println(e.message);
    }
}
