package com.f5.patrones.abstract_factory.concrets.products.oldest

import com.f5.patrones.abstract_factory.interfaces.products.Table

class OldestTable: Table {
    override fun hasLegs() {
        println("Mesa Antigua 4 patas")
    }

    override fun sitOn() {
        println("mesa antigua *NO* parea sentarse")
    }
}