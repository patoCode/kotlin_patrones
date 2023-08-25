package com.f5.patrones.builder.concrets.products

import com.f5.patrones.builder.interfaces.*
import com.f5.patrones.builder.interfaces.MyBuilder



enum class CarType {
    CITY_CAR, SPORTS_CAR, SUV, NONE
}

enum class EngineType{
    A, B, C, NONE
}

enum class TransmitionType{
    MANUAL, AUTOMATIC, ELECTRIC, HYBRID
}

open class Car(builder: MyBuilder){
}
