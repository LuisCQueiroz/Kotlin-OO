package two.digitalinnovation.digionebank.teste

import two.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach{ elemento ->
        println("${elemento.name} - ${elemento.descricao}")


    }
    ClienteTipo.values().forEach { it ->
        println("${it.name} - ${it.descricao}")

    }

    val pf = ClienteTipo.PF
    println("==>${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("==>${pj.name} - ${pj.descricao}")
}