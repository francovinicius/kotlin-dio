//atribuição
//ex.: variavel (operação) > sinal de igual > variavel -> a+=b

//Comando

// soma = + ou count
//sub = - ou minus
//mult = * ou times
//div = / ou div
//resto % ou mod

fun OpAritmeticos () {
    val count = 10
    val times = 9
    val r = times+count

    println(r)
    println(count.plus(times))
}


//Op de comparação

/*
> ou <  Comando a.compareTo(b)>0
>= ou <= Comando a.compareTo(b)>=0
a==b Comando a.equais(b)
a!=b Comando !(a.equais(b))
 */

fun OpComp() {
    val count = 10
    val times = 9
    val r = count == times

    println(r)
    println(!(count.equals(times)))

}