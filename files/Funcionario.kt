package files

data class Funcionario( val nome: String, val salario: Double, val sexo: String) {
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
        """.trimIndent()
}
