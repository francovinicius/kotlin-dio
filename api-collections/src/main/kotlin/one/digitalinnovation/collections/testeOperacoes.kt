package one.digitalinnovation.collections

fun main() {

    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("------")

    println("Maior salario: ${salarios.max()}")
    println("Menor salario: ${salarios.min()}")
    println("Media salarial: ${salarios.average()}")

    println("------")

    //filtrando salarios maior que 2500
    val salariosMaioresQue2500 = salarios.filter { it > 2500.0 }
    salariosMaioresQue2500.forEach { println(it) }

    println("------")
    //realizar uma contagem percorrendo o array e vendo quantos elementos estão dentro do range abaixo
    println(salarios.count{ it in 2000.00..5000.0})
    println("------")

    //realizar uma busca especifica
    println(salarios.find{ it == 2250.0})
    println(salarios.find{ it == 250.0})
    println("------")

    //encontrar qualquer
    println(salarios.any{ it == 1000.0})
}