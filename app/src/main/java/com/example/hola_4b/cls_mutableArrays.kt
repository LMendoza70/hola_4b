package com.example.hola_4b

class cls_mutableArrays {
    var Calificaciones=mutableListOf<Float>()
    var Productos=mutableListOf<cls_Producto>()

    fun Captura(){
        println("Ejemplo de una data class")
        Productos.add(cls_Producto("Galletas",20.00F))
        println("Captura las Calificaciones...")

        for (i in 1..7){
            println("Captura la calificacion ${i}")
            val x=readln().toFloat()
            Calificaciones.add(x)
            //Calificaciones.add(readln().toFloat())
        }
    }
    fun Imprimir(){
        println("Las calificaciones capturadas son...")
        for (i in 1 .. Calificaciones.size){
            println("La calificacion num ${i} es ${Calificaciones[i-1]}")
        }
    }
}