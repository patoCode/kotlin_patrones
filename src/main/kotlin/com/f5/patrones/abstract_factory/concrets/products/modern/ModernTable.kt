package com.f5.patrones.abstract_factory.concrets.products.modern

import com.f5.patrones.abstract_factory.interfaces.products.Table

class ModernTable: Table {
    override fun hasLegs() {
        println("Mesa MODERNA 4 patas")
    }

    override fun sitOn() {
        println("Mesa moderna *NO* para sentarse")
    }
}