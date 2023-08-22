package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "vini"
    nomes[1] = "wagner"
    nomes[2] = "Pablo"

    for (nome in nomes){
        println(nome)
    }

    println("-----")
    nomes.sort()
    nomes.forEach {
        println(it)
    }
}