package com.example.hola_4b

import kotlin.math.sqrt

class tda_Triangulo2(private var _l1: Float,private var _l2: Float,private var _l3: Float) {

    public var l1: Float
        get() = _l1
        set(value) {_l1=value}

    var l2: Float
        get() = _l2
        set(value) {_l2=value}

    var l3: Float
        get() = _l3
        set(value) {_l3=value}

    fun perimetro(): Float{
        return _l1+_l2+_l3
    }

    fun area(): Float{
        val s: Float=(_l1+_l2+_l3)/2
        return sqrt(s*(s-_l1)*(s-_l2)*(s-_l3))
    }
}