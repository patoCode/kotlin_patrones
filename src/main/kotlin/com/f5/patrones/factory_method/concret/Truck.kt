package com.f5.patrones.factory_method.concret

import com.f5.patrones.factory_method.interfaces.Transport

class Truck: Transport {

    override fun delivery(){
        println("Entrega desde un Camión")
    }
}