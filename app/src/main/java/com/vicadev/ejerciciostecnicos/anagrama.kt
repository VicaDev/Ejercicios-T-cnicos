package com.vicadev.ejerciciostecnicos

// Un Anagrama consiste en formar una palabra reordenando todas las letras de otra palabra inicial.
fun main() {
    print(isAnagrama("pagar", "praga"))
}

private fun isAnagrama(w1: String, w2: String): Boolean {
    if (w1.lowercase() == w2.lowercase()) return false

    return w1.lowercase().toCharArray().sortedArray().contentEquals(w2.lowercase().toCharArray().sortedArray())
}