import kotlin.reflect.typeOf

fun main() {
    try {
        println("Input a:");
        val a = readln().toDouble();
        println("Input b:");
        val b = readln().toDouble();
        println("Input c:");
        val c = readln().toDouble();

        if (a == b && a == c) {
            println("All numbers are equal");
        }
        else if (a == b) {
            println("a and b are equal");
        }
        else if (a == c) {
            println("a and c are equal");
        }
        else if (b == c) {
            println("b and c are equal");
        }
        else {
            if (a in b..c) {
                println("b,a,c");
            }
            if (a in c..b) {
                println("c,a,b");
            }
            if (b in a..c) {
                println("a,b,c");
            }
            if (b in c..a) {
                println("c,b,a");
            }
            if (c in a..b) {
                println("a,c,b");
            }
            if (c in b..a) {
                println("b,c,a");
            }
        }
    } catch (e: Exception) {
        println(e.message)
    }
}