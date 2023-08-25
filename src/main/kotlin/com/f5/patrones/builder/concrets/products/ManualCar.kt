package com.f5.patrones.builder.concrets.products

import com.f5.patrones.builder.concrets.BuilderManualCar
import com.f5.patrones.builder.interfaces.MyBuilder

class ManualCar(
            var type: CarType,
            var seats: Int,
            var engine: EngineType,
            var tripComputer: Boolean,
            var gps: Boolean,
){

}