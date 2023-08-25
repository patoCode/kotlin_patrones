package com.f5.patrones.factory_method

import com.f5.patrones.factory_method.concret.Ship
import com.f5.patrones.factory_method.concret.Truck
import com.f5.patrones.factory_method.interfaces.Transport

class FactoryMethod {

    var listTransports = listOf(
                                Truck(),Ship(),
                                Truck(),Truck(),
                                Ship(),Ship(),
                                Ship(),Truck(),
                            )
    fun demo(){
        for (i in listTransports.indices){
            deliverPackage(listTransports[i])
        }
    }

    private fun deliverPackage(transport: Transport){
        transport.delivery()
    }

}