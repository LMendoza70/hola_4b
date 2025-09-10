package com.example.hola_4b

import java.lang.reflect.Constructor

class tda_Triangulo {
    //clase con constructor secundario
    private  var _l1: Float=0F
    private  var _l2: Float=0F
    private  var _l3: Float=0F

    public var l1: Float
        get() = _l1
        set(value) {_l1=value}

    var l2: Float
        get() = _l2
        set(value) {_l2=value}

    var l3: Float
        get() = _l3
        set(value) {_l3=value}

    public fun Constructor(l1: Float, l2: Float, l3: Float){
        _l1=l1
        _l2=l2
        _l3=l3
    }

}