package com.vicadev.ejerciciostecnicos

import java.text.Normalizer

//Palindromo es una palabra o frase que se lee igual en un sentido que en otro.
fun main() {
    println(palindromo("Ana lleva al oso la avellana."))
    println(palindromo("Adivina ya te opina, ya ni miles origina, ya ni cetro me domina, ya ni monarcas, a repaso ni mulato carreta, acaso nicotina, ya ni cita vecino, anima cocina, pedazo gallina, cedazo terso nos retoza de canilla goza, de pánico camina, ónice vaticina, ya ni tocino saca, a terracota luminosa pera, sacra nómina y ánimo de mortecina, ya ni giros elimina, ya ni poeta, ya ni vida"))
    println(palindromo("A mamá, Roma le aviva el amo a papá, y a papá, Roma le aviva el amor a mamá."))
}

private fun palindromo(text: String): Boolean {
    val normalizarText = Normalizer.normalize(text.lowercase(), Normalizer.Form.NFD)
        .replace("[^\\p{ASCII}]".toRegex(), "")
        .replace("[^a-z0-9]".toRegex(), "")

    return normalizarText == normalizarText.reversed()
}