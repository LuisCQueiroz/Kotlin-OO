package two.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Luis"

    var cpf:String = "123.123.123-92"
    private set  //deixa privado não podendo ser alterado

    /*inner class Endereco{
        var rua:String = "Rua teste, 1234"
    }*/
}
fun main() {
    val  luis = Pessoa()

    //luis.cpf ="453" => como está privado
    println(luis.nome)
    println(luis.cpf)

    //println(luis.Endereco().rua)

}

