package com.f5.patrones.factory_method.concret

import com.f5.patrones.factory_method.interfaces.Transport

class Ship: Transport {

    override fun delivery(){
        println("Entrega desde un Barco")
    }
}