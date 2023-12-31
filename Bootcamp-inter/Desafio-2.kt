/*

Desafio
Você deve calcular o consumo médio de um automóvel onde será informada a distância total percorrida (em Km) e o total de combustível consumido (em litros).

Entrada
Você receberá dois valores: um valor inteiro X com a distância total percorrida (em Km), e um valor real Y que representa o total de combustível consumido, com um dígito após o ponto decimal.

 */

import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);

    val x: Int = leitor.nextInt();
    val y: Double = leitor.nextDouble();

    val media: Double = x.toDouble() / y;


    println(String.format("%.3f km/l", media));
}