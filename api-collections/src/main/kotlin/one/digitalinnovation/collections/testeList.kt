package one.digitalinnovation.collections

fun main() {

    val joao = Funcionario("Joao", 1000.0)
    val vini = Funcionario("Vini", 15000.0)
    val pablo = Funcionario("Pablo", 3000.0)

    val funcionarios = listOf(joao, vini, pablo)

    funcionarios.forEach{
        println(it)
        println("-----")

    }

    println(funcionarios.find {it.nome == "Vini"})


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