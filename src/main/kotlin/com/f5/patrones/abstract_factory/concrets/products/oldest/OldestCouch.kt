package com.f5.patrones.abstract_factory.concrets.products.oldest

import com.f5.patrones.abstract_factory.interfaces.products.Couch

class OldestCouch : Couch {
    override fun hasLegs() {
        println("Sofa Antiguo 4 patas")
    }

    override fun sitOn() {
        println("Sofa Antiguo para sentarse")
    }

}
