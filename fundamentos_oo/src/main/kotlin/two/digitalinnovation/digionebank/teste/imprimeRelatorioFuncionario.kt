package two.digitalinnovation.digionebank.teste

import two.digitalinnovation.digionebank.Funcionario

class imprimeRelatorioFuncionario {
    companion object{
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}