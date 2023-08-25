package one.digitalinnovation.collections

fun main() {

    val joao = Funcionario("Joao", 3000.0, "clt")
    val vini = Funcionario("Vini", 15000.0, "clt")
    val pablo = Funcionario("Pablo", 5000.0, "pj")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(vini.nome, vini)
    repositorio.create(pablo.nome, pablo)

    println(repositorio.findById(joao.nome))

    println("---------------------")

    repositorio.findAll().forEach { println(it) }

    println("---------------------")

    repositorio.remove(joao.nome)
    repositorio.findAll().forEach { println(it) }

}