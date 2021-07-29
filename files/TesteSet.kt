package files

fun main() {
    val rodrigo = Funcionario(nome = "Rodrigo", salario = 2200.0, sexo = "Masculino")
    val italo = Funcionario(nome = "Italo", salario = 1500.0, sexo = "Masculino")
    val eduarda = Funcionario(nome = "Eduarda", salario = 3000.0, sexo = "Feminino")

    val  funcionarios1 = setOf(rodrigo, italo)
    val  funcionarios2 = setOf(eduarda)

    val resultUnion =funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println(it) }

    println("------------------")
    val  funcionarios3 = setOf(rodrigo, italo, eduarda)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{ println(it) }

    println("------------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach{ println(it) }
}