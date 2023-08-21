/*

Desafio
Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos. Considere que o número zero é positivo, mas não pode ser considerado como positivo ou negativo.

Entrada
Você receberá 5 valores inteiros.

Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.

 */

fun main(args: Array<String>) {

    val inteiros = mutableListOf<Int>()
    val pares = mutableListOf<Int>()
    val impares = mutableListOf<Int>()
    val positivos = mutableListOf<Int>()
    val negativos = mutableListOf<Int>()

    for (i in 1..5) { inteiros.add(readLine()!!.toInt()) }

    for (i in inteiros) {
        if (i % 2 == 0) { pares.add(i) }
        if (i % 2 != 0) { impares.add(i) }
        if (i > 0) { positivos.add(i) }
        if (i < 0) { negativos.add(i) }
    }

    println("${pares.size} par(es)")
    println("${impares.size} impar(es)")
    println("${positivos.size} positivo(s)")
    println("${negativos.size} negativo(s)")

}
