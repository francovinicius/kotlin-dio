/*  Funcoes
*
* Prefixo Fun nomeDaFuncao(nome:tipo):TipoRetorno{}*/

private fun getFullname(name:String, lastName:String):String{
    val fullName = $name $lastName
    return fullName
}

private fun getFullname(name:String, lastName:String):String{
    return $name $lastname
}

private fun getFullname(name:String, lastName:String):String = $name $lastName


        //Funcoes de ordem superior

val x = calculate(12,4,::sum)
val y = calculate(12,4){a,b -> a*b}


fun main() {

    val z:Int

    z = calculate(34, 98,::sum)
    print(z)
}

fun sum(a1:Int, a2:Int) = a1.plus(a2)

fun calculate(n1:Int,n2:Int,operation:(Int,Int)->Int):Int{
    val result = operation(n1,n2)
    return result
}