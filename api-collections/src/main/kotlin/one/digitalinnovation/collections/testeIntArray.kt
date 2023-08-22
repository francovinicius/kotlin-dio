package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 8
    values[3] = 9
    values[4] = 5

    for (valor in values) {
        println(valor)
    }
}