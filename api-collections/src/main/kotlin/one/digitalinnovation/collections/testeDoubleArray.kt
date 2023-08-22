package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 100.0
    salarios[2] = 300.0

    salarios.forEach { println(it) }
    println("----------")

    //dar um aumento de 10%
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }

    salarios.forEach { println(it) }

    println("----------")

    val salarios2 = doubleArrayOf(1500.0, 150.0, 5000.0)
    salarios2.sort()
    salarios2.forEach {
        println(it)
    }

}