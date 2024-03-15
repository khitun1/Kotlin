fun main() {
    try {
        println("Input number:")
        val num = readln().toInt()
        println("Dividers:\n1")

        var divider = 1
        while (++divider < num) {
            if (num % divider == 0) {
                println(divider)
            }
        }

        println(num)
    } catch (e: Exception) {
        println(e.message)
    }
}