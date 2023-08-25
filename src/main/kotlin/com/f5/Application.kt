package com.f5

import com.f5.patrones.abstract_factory.AbstractMethod
import com.f5.patrones.factory_method.FactoryMethod
import com.f5.plugins.*
import io.ktor.server.application.*

fun main() {

    println("========================================")
    val factoryMethod = FactoryMethod()
    factoryMethod.demo()

    println("========================================")
    val abstractMethod = AbstractMethod()
    abstractMethod.demo()

    println("========================================")


}
