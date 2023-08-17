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

//Op logicos

/*
E && Comando (Exoressão1)&&(Exoressão2) (Exoressão1)and(Exoressão2)
Ou || Comando (Exoressão1)||(Exoressão2) (Exoressão1)or(Exoressão2)
 */

fun OpLogicos() {
    val count = 10
    val times = 9
    val r = count == times

    println(r)
    println(!(count.equals(times)))

}

//Op In e range

/*
Contem In
Não contem !In
Range/faixa de valores Int..Int
 */

fun OpLogicos() {
    val numbers = listOf(3, 9, 0, 1, 2)
    println(12 in numbers)
    //false

    println(12 in 0..20)
    //true

}