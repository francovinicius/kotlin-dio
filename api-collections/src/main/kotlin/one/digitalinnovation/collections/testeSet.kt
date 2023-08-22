package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 3000.0, "clt")
    val vini = Funcionario("Vini", 15000.0, "clt")
    val pablo = Funcionario("Pablo", 5000.0, "pj")

    val funcionarios1 = setOf(joao, pablo)
    val funcionarios2 = setOf(vini)

    println(funcionarios1)
    println(funcionarios2)

    println("------------------------------------")

    val funcionarios3 = setOf(joao, pablo, vini)

    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("------------------------------------")

    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}