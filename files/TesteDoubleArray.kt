package files

fun main(){
    val salarios = DoubleArray(3)
    salarios[0] = 3500.0
    salarios[1] = 5000.0
    salarios[2] = 1000.0

    salarios.forEach { println(it) }

    println("--------------------------------------")
    salarios.forEachIndexed{ index, salario ->
        salarios[index] = salario * 1.2
    }
    salarios.forEach { println(it) }

    println("--------------------------------------")

    val bonus = doubleArrayOf(500.0, 220.0, 1000.0)
    bonus.sort()
    bonus.forEach { println(it) }
}