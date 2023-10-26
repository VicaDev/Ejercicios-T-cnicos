package com.vicadev.ejerciciostecnicos

//Transforma un número decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
fun main() {
    print(decimalToBinary(2555))
}

private fun decimalToBinary(decimal: Int): String {
    var num = decimal
    var binary = ""

    while (num != 0) {
        var reminder = num % 2
        num /= 2

        binary = "$reminder$binary"
    }

    return binary.ifEmpty { "0" }
}