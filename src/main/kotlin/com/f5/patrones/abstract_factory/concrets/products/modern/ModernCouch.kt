package com.f5.patrones.abstract_factory.concrets.products.modern

import com.f5.patrones.abstract_factory.interfaces.products.Couch

class ModernCouch: Couch {
    override fun hasLegs() {
        println("Sofa MODERNO 4 patas")
    }

    override fun sitOn() {
        println("Sofa Moderno 4 patas")
    }
}