package one.digitalinnovation.collections

fun main() {

    val joao = Funcionario("Joao", 3000.0, "clt")
    val vini = Funcionario("Vini", 15000.0, "clt")
    val pablo = Funcionario("Pablo", 5000.0, "pj")

    val funcionarios = listOf(joao, vini, pablo)

    funcionarios.forEach{
        println(it)
        println("-----")

    }

    println(funcionarios.find {it.nome == "Vini"})

    println("-------*******-------")

    funcionarios.sortedBy { it.salario }.forEach{
        println(it)
        println("----")
    }

    println("-------*******--------------*******-------")

    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach{
        println(it)
        println("----")
    }

}