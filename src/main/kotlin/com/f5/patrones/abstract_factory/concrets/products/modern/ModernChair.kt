package com.f5.patrones.abstract_factory.concrets.products.modern

import com.f5.patrones.abstract_factory.interfaces.products.Chair

class ModernChair: Chair {

    override fun hasLegs() {
        println("Silla MODERNA 4 patas")
    }

    override fun sitOn() {
        println("Silla MODERNA para sentarse")
    }
}