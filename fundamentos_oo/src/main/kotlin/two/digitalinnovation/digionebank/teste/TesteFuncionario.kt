package two.digitalinnovation.digionebank.teste

import two.digitalinnovation.digionebank.Funcionario
import two.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val  luis = Pessoa(nome = "Luis Carlos de Queiroz", cpf = "123.456.789-99")
    println(luis.nome)
    println(luis.cpf)

    val Joao = Funcionario("Luis Carlos de Queiroz", "123.456.789-99", BigDecimal.valueOf(2000.0))
    println(Joao.nome)
    println(Joao.cpf)
    println(Joao.salario)

}
