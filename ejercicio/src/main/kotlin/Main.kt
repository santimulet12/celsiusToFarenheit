package org.example


//Conversor de temperaturas (Celsius ↔ Fahrenheit)
//Implementa funciones de conversión y permite al usuario elegir el tipo de conversión.

//formula: ( °C × 9/5) + 32 =  °F

fun convertCelToFar(celsius: Double): Double{
    val farenheit: Double = (celsius * 9/5) + 32
    return farenheit
}
fun convertFarToCel(farenheit: Double): Double{
    return (farenheit - 32) * 5/9
}
fun main() {
    print("1)Convertir de Celcius a Farenheit.\n2)Convertir de Farenheit a Celcius.\nIngrese la opción que desea(1/2):")

    try {
        val opcion = readLine()?.toInt()
        if (opcion != null) {
            if (opcion==1){
                print("Ingrese los grados en celsius: ")
                val cel = readLine()?.toDouble()
                if (cel != null){
                    println("$cel grados celsius son ${convertCelToFar(cel)} farenheit")
                }
                else{
                    println("No has ingresado ningún número.")
                }
            }
            else{
                print("Ingrese los grados en farenheit: ")
                val far = readLine()?.toDouble()
                if (far != null){
                    println("$far grados farenheit son ${convertFarToCel(far)} farenheit")
                }
            }
        } else {
            println("No has ingresado una opcion válida.")
        }
    } catch (e: NumberFormatException) {
        println("No has ingresado una opcion válida.")
    }
}