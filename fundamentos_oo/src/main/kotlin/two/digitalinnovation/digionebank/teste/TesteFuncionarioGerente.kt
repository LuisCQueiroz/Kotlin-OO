package two.digitalinnovation.digionebank.teste

import two.digitalinnovation.digionebank.Gerente

fun main(){
    val maria = Gerente("Maria do Carmo", "123.456.789-99", 5000.0)

    imprimeRelatorioFuncionario.imprime(maria)
}
