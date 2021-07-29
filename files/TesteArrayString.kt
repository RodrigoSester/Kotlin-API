package files

fun main(){
    val nomes = Array(3){ "" }
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "Rodrigo"

    for(nome in nomes){
        println(nome)
    }

    println("----------------")
    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Guilherme", "Mateus", "Elisabeth")

    println("----------------")
    nomes.sort()
    nomes2.forEach { println(it) }
}