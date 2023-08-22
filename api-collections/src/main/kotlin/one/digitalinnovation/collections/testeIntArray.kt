package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 8
    values[3] = 9
    values[4] = 5

    //declaramos valor
    for (valor in values) {
        println(valor)
    }

    //forma 2

    values.forEach {
        println(it)
    }

    values.forEach { valor ->
        println(valor)
    }

    println("--------------------")

    for (index in values.indices) {
        println(values[index])
    }
    println("--------------------")

    //ordenar (por padrao do menor pro maior)
    values.sort()
    for (valor in values) {
        println(valor)
    }
}