package two.digitalinnovation.digionebank.teste

fun main() {
    val digiOneBank = two.digitalinnovation.digionebank.Banco(nome = "DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco2")

    println(banco2.info())

}