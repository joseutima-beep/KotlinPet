package com.example.taller

// 1. Declaración de variables con tipos explícitos
val nombre: String = "Max"
var edad: Int = 3
var peso: Float = 12.5f
val sexo: Char = 'M'
var vacunado: Boolean = true

// 2. Mostrar la ficha inicial del paciente
println("ANTES: Paciente: $nombre | Edad: $edad años | Peso: $peso kg | Sexo: $sexo | Vacunado: $vacunado")

// 3. Simular que la mascota cumple un año y aumenta de peso
edad = edad + 1
peso = peso + 1.5f

// 4. Mostrar la ficha actualizada del paciente
println("DESPUÉS: Paciente: $nombre | Edad: $edad años | Peso: $peso kg | Sexo: $sexo | Vacunado: $vacunado")

// PUNTO 2: Clasificacion con when y operadores logicos
val edadClasificacion: Int = 9
val esUrgencia: Boolean = false

val categoria: String = when {
    edadClasificacion in 0..1 -> "Cachorro"
    edadClasificacion in 2..7 -> "Adulto"
    edadClasificacion >= 8 -> "Senior"
    else -> "Edad no valida"
}

println("Categoria: $categoria")

if (esUrgencia || categoria == "Senior") {
    println("Prioridad Alta")
} else {
    println("Atencion Regular")
}

// PUNTO 3: Lista de mascotas y turnos
val mascotas: List<String> = listOf("Luna", "Max", "Toby", "Lola")

for ((indice, mascota) in mascotas.withIndex()) {
    println("Turno ${indice + 1}: $mascota")
}

for (minuto in 5 downTo 1) {
    println("$minuto minuto(s) para abrir la clinica")
}

// PUNTO 4: Contacto de emergencia
val contactoEmergencia: String? = null
val cantidadCaracteres: Int? = contactoEmergencia?.length
val contactoFinal: String =
    contactoEmergencia ?: "Sin contacto registrado"

println("Caracteres del contacto: $cantidadCaracteres")
println("Contacto final: $contactoFinal")

// PUNTO 5: Lambda y recargo nocturno
val precios: List<Double> = listOf(30000.0, 25000.0, 18000.0)

val recargoNocturno: (Double) -> Double = { precio ->
    precio * 1.10
}

precios.forEach {
    val precioAjustado = recargoNocturno(it)
    println("Precio original: $it | Precio con recargo: $precioAjustado")
}