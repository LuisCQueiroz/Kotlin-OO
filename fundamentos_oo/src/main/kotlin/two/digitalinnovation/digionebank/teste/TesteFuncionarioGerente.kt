package two.digitalinnovation.digionebank.teste

import two.digitalinnovation.digionebank.Gerente

fun main(){
    val maria = two.digitalinnovation.digionebank.Gerente("Maria do Carmo", "123.456.789-99", 5000.0, "senha123")

    imprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)

}



