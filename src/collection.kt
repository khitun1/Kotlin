fun main() {
    try {
        val collection: MutableCollection<Double> = mutableListOf()
        println("Input array (until -1): ")

        var num: Double = readln().toDouble()
        while (num != -1.0) {
            collection.add(num)
            num = readln().toDouble()
        }

        var min = collection.elementAt(0)
        val max = collection.last()

        var index = -1

        while (++index < collection.size) {
            if (collection.elementAt(index) in min..max) {
                min = collection.elementAt(index)
            }
            else {
                collection.remove(collection.elementAt(index))
                index--
            }
        }

        println(collection)

    } catch (e: Exception) {
        println(e.message)
    }
}