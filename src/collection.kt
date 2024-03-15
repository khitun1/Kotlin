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
        var collectionForRemove: MutableCollection<Double> = mutableSetOf()

        for (item in collection) {
            if (item in min..max) {
                min = item
            }
            else {
                collectionForRemove.add(item)
            }
        }

        collection.removeAll(collectionForRemove.toSet())
        println(collection)

    } catch (e: Exception) {
        println(e.message)
    }
}