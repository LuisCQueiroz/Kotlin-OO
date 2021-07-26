package two.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Luis"

    var cpf:String = "123.123.123-92"
    private set  //deixa privado não podendo ser alterado

    /*inner class Endereco{              //teste para mostrar como inserir novo campo
        var rua:String = "Rua teste, 1234"
    }*/

    constructor()

    fun pessoaInfo() = "nome: $nome e cpf: $cpf"
}
fun main() {
    val  luis = Pessoa()

    //luis.cpf ="453" => como está privado
    println(luis.nome)
    println(luis.cpf)

    println("=====================")
    println(luis.pessoaInfo())

    //println(luis.Endereco().rua)

}

