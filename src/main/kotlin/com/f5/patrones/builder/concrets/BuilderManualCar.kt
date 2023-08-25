package com.f5.patrones.builder.concrets

import com.f5.patrones.builder.concrets.products.*
import com.f5.patrones.builder.concrets.products.ManualCar
import com.f5.patrones.builder.interfaces.MyBuilder

class BuilderManualCar() : MyBuilder {

    private var type: CarType
    private var seats: Int
    private var engine: EngineType
    private var tripComputer: Boolean
    private var gps: Boolean


    init{
        type = CarType.NONE
        seats = 0
        engine = EngineType.NONE
        tripComputer = false
        gps = false
    }

    fun result(): ManualCar = ManualCar(type, seats, engine, tripComputer, gps)

    override fun reset() {

    }

    override fun setType(type: CarType) {
        this.type = type
    }

    override fun setSeats(number: Int) {
        this.seats = number
    }

    override fun setEngine(engine: EngineType) {
        this.engine = engine
    }

    override fun setTripComputer(value: Boolean) {
        this.tripComputer = value
    }

    override fun setGPS(value: Boolean) {
        this.gps = value
    }

}