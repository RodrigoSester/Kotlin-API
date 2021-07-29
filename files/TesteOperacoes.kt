package files

fun main(){
    val salarios = doubleArrayOf(
        1000.0,
        2250.0,
        4000.0
    )

    for(salario in salarios){
        println(salario)
    }

    println("--------------------")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media dos salarios: ${salarios.average()}")

    println("--------------------")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach{println(it)}
}