package files

fun main() {
    val rodrigo = Funcionario(nome = "Rodrigo", salario = 2200.0, sexo = "Masculino")
    val italo = Funcionario(nome = "Italo", salario = 1500.0, sexo = "Masculino")
    val eduarda = Funcionario(nome = "Eduarda", salario = 3000.0, sexo = "Feminino")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(rodrigo.nome, rodrigo)
    repositorio.create(italo.nome, italo)
    repositorio.create(eduarda.nome, eduarda)

    println(repositorio.findById(rodrigo.nome))

    println("----------------------")
    repositorio.findAll().forEach{ println(it) }

    println("----------------------")
    repositorio.remove(italo.nome)
    repositorio.findAll().forEach{ println(it) }
}