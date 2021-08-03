package files

fun main() {
    val rodrigo = Funcionario(nome = "Rodrigo", salario = 2200.0, sexo = "Masculino")
    val italo = Funcionario(nome = "Italo", salario = 1500.0, sexo = "Masculino")
    val eduarda = Funcionario(nome = "Eduarda", salario = 3000.0, sexo = "Feminino")

    val funcionarios = mutableListOf(rodrigo, eduarda)
    funcionarios.forEach{ println(it) }

    println("--------  LIST  ---------")
    funcionarios.add(italo)
    funcionarios.forEach{ println(it) }

    println("-----------------")
    funcionarios.remove(rodrigo)
    funcionarios.forEach{ println(it) }


    println("--------  SET  ---------")
    val funcionariosSet = mutableSetOf(rodrigo)
    funcionariosSet.forEach { println(it) }

    println("-----------------")

    funcionariosSet.add(italo)
    funcionariosSet.add(eduarda)
    funcionariosSet.forEach { println(it) }

    println("-----------------")

    funcionariosSet.remove(eduarda)
    funcionariosSet.forEach { println(it) }
}