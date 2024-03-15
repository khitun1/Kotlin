
fun main() {
    try {
        var arr: Array<Double> = arrayOf()
        println("Input array (until -1): ")
        var num: Double = readln().toDouble()
        while (num != -1.0) {
            arr += num
            num = readln().toDouble()
        }

        if (arr.last() < arr[0]) {
            return
        }

        var min = arr[0]
        val max = arr.last()
        var totalArr: Array<Double> = arrayOf()

        arr.forEach {
            if (it in min..max) {
                min = it
                totalArr += it
            }
        }

        totalArr.forEach {
            println(it)
        }

    } catch (e: Exception) {
        println(e.message);
    }
}
