package com.f5.patrones.abstract_factory.interfaces

import com.f5.patrones.abstract_factory.interfaces.products.*

interface FurnitureFabric {
    fun createChair(): Chair
    fun createCoach(): Couch
    fun createTable(): Table
}