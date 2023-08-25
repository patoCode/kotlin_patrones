package com.f5.patrones.abstract_factory.concrets.products.oldest

import com.f5.patrones.abstract_factory.interfaces.products.Chair

class OldestChair: Chair {
    override fun hasLegs() {
        println("Silla Vieja 4 patas")
    }

    override fun sitOn() {
        println("Silla Vieja para sentarse")
    }

}