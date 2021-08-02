package two.digitalinnovation.digionebank.teste

import two.digitalinnovation.digionebank.Cliente
import two.digitalinnovation.digionebank.ClienteTipo

fun main(){
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123.456.456-77",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}

