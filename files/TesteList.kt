package files

fun main(){
    val rodrigo = Funcionario(nome = "Rodrigo", salario = 2200.0, sexo = "Masculino")
    val italo = Funcionario(nome = "Italo", salario = 1500.0, sexo = "Masculino")
    val eduarda = Funcionario(nome = "Eduarda", salario = 3000.0, sexo = "Feminino")

    val funcionarios = listOf(rodrigo, italo, eduarda) // não da pra adicionar nada

    funcionarios.forEach{ println(it) }

    println("-----------------------")
    println(funcionarios.find{ it.nome == "Eduarda" }) // procura o funcionario pelo nome

    println("-----------------------")
    funcionarios
        .sortedBy { it.salario } // organiza em ordem crescente os salários
        .forEach{ println(it) }

    println("-----------------------")
    funcionarios
        .groupBy { it.sexo } // faz um grupo de acordo com o sexo
        .forEach{ println(it) }
}