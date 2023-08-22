package one.digitalinnovation.collections

fun main() {

    val joao = Funcionario("Joao", 3000.0)
    val vini = Funcionario("Vini", 15000.0)
    val pablo = Funcionario("Pablo", 5000.0)

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


}

data class  Funcionario(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
        """.trimIndent()

}