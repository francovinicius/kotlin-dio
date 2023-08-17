fun main() {
    val media = readLine()!!.toDouble();

    val resultado = when {
        media < 5 -> println("REP");
        media < 7 -> println("REC");
        else -> println("APR");
    }
}