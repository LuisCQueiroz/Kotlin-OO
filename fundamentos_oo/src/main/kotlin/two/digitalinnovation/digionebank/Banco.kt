package two.digitalinnovation.digionebank

data class Banco(
    val nome:String,
    val numero:Int
){
    fun info() = "Banco: $nome - número: $numero"
}
