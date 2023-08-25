package one.digitalinnovation.collections

fun main() {

    val joao = Funcionario("Joao", 3000.0, "clt")
    val vini = Funcionario("Vini", 15000.0, "clt")
    val pablo = Funcionario("Pablo", 5000.0, "pj")

    val funcionarios = mutableListOf(joao, vini)
    funcionarios.forEach{ println(it) }

    println("------- List ----------")

    funcionarios.add(pablo)
    funcionarios.forEach{ println(it) }

    println("-----------------")

    funcionarios.remove(joao)
    funcionarios.forEach{ println(it) }

    println("-------- Set ---------")

    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("-----------------")

    funcionarioSet.add(vini)
    funcionarioSet.add(pablo)

    funcionarioSet.forEach { println(it) }

    println("-----------------")
    funcionarioSet.remove(pablo)
    funcionarioSet.forEach { println(it) }
}
