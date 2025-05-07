# Conversor de Temperaturas

## Descripción
Este programa es un conversor de temperaturas escrito en Kotlin que permite realizar conversiones entre grados Celsius y Fahrenheit. Es una aplicación de consola simple pero efectiva que ofrece dos funcionalidades principales:

1. Convertir de grados Celsius a Fahrenheit
2. Convertir de grados Fahrenheit a Celsius

## Funcionalidades

- Interfaz de consola interactiva
- Manejo de errores para entradas no válidas
- Conversiones precisas entre escalas de temperatura
- Resultados formateados claramente

## Fórmulas utilizadas

- De Celsius a Fahrenheit: `°F = (°C × 9/5) + 32`
- De Fahrenheit a Celsius: `°C = (°F - 32) × 5/9`

## Cómo usar

1. Ejecute el programa
2. Seleccione una opción:
   - `1` para convertir de Celsius a Fahrenheit
   - `2` para convertir de Fahrenheit a Celsius
3. Ingrese el valor de temperatura que desea convertir
4. El programa mostrará el resultado de la conversión

## Ejemplo de uso

```
1)Convertir de Celcius a Farenheit.
2)Convertir de Farenheit a Celcius.
Ingrese la opción que desea(1/2): 1
Ingrese los grados en celsius: 25
25.0 grados celsius son 77.0 farenheit
```

## Estructura del código

- `convertCelToFar(celsius: Double): Double` - Función para convertir de Celsius a Fahrenheit
- `convertFarToCel(farenheit: Double): Double` - Función para convertir de Fahrenheit a Celsius
- `main()` - Función principal que maneja la interfaz de usuario y el flujo del programa

## Requisitos

- JDK 8 o superior
- Kotlin Runtime

## Notas de implementación

El programa incluye manejo de excepciones para evitar errores cuando el usuario ingresa valores no numéricos, utilizando bloques try-catch para capturar excepciones de tipo `NumberFormatException`.
