fun main() {
    val (populacaoA, populacaoB) = readLine()!!.split(" ").map { it.toInt() }

    var anos = 0
    var populacaoAAtual = populacaoA
    var populacaoBAtual = populacaoB

    while (populacaoAAtual <= populacaoBAtual) {
        populacaoAAtual += (populacaoAAtual * 0.03).toInt() // Taxa de crescimento de 3% para A
        populacaoBAtual += (populacaoBAtual * 0.015).toInt() // Taxa de crescimento de 1.5% para B
        anos++
    }

    println(anos)
}
