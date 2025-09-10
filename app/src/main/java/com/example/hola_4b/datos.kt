package com.example.hola_4b

class datos {
    /*
    * tipos de datos
    * datos enteros Byte, Short, Int, Long
    * datos numericos decimales Float, Double
    * datos booleanos Boolean
    * datos Caracter Char
    * cadenas de texto String */


    fun ejemplo1(){
        //variables inmutables val "lo mismo que una cosntante en c#"
        //variables mutables var
        var score:Int
        var califcacion : Byte
        califcacion=100

        val name: String="Garnol...";
        score=0
        //name="Chuimai..."
        println("Hola : ${name}")
        println("Score inicial es : ${score}")
        //incrementamos el score
        score+=50;
        println("Nuevo Scroe : ${score}")
    }
    fun EntradasSalidas(){
        println("Captura un valor entero...")
        var numero:Int
        numero= readln().toInt()
        println("El valor capturado es : ${numero}")
    }
    //function int suma(int v1, int v2){}
    fun suma(num1: Int, num2: Int):Int{
        var res:Int=0;
        res=num1+num2
        return  res;
    }

    //ejemplo 3
}