package two.digitalinnovation.digionebank

abstract class Funcionario (
    nome: String,
    cpf: String,
    val salario: Double,
) : two.digitalinnovation.digionebank.Pessoa(nome,cpf) {
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salário: $salario
        Auxilio: ${calculoAuxilio()}
    """.trimIndent()
    }
