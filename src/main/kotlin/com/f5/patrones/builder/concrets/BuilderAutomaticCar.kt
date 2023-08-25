package com.f5.patrones.builder.concrets

import com.f5.patrones.builder.concrets.products.AutomaticCar
import com.f5.patrones.builder.interfaces.MyBuilder

class BuilderAutomaticCar: MyBuilder {

    private var result: AutomaticCar? = null

    override fun reset() {
        println("-- RESET AUTO AUTOMATICO --")
    }

    override fun setSeats(number: Int) {
        println("Agregando $number asientos, al auto automatico")
    }

    override fun setEngine(engine: String) {
        println("Agregando engine $engine al auto mecanico")
    }

    override fun setTripComputer() {
        println("Agregando computador al auto mecanico")
    }

    override fun setGPS() {
        println("agregando GPS al auto manual")
    }

    fun result(): AutomaticCar = result!!

}