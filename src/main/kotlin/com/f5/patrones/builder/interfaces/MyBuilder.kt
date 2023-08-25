package com.f5.patrones.builder.interfaces

import com.f5.patrones.builder.concrets.products.CarType
import com.f5.patrones.builder.concrets.products.EngineType

interface MyBuilder {

    fun reset()
    fun setType(type: CarType)
    fun setSeats(number: Int)
    fun setEngine(engine: EngineType)
    fun setTripComputer(value: Boolean)
    fun setGPS(value: Boolean)
}

