package com.f5.patrones.abstract_factory

import com.f5.patrones.abstract_factory.concrets.ModernFactory
import com.f5.patrones.abstract_factory.concrets.OldestFactory

class AbstractMethod {


    var mueblesModernos = ModernFactory()
    var mueblesViejos = OldestFactory()

    var sillas = listOf(mueblesModernos.createChair(), mueblesViejos.createChair())
    var sofas = listOf(mueblesModernos.createCoach(), mueblesViejos.createCoach())
    var mesas = listOf(mueblesViejos.createTable(), mueblesModernos.createTable())

    fun demo(){
        for(i in sillas.indices){
            sillas[i].hasLegs()
        }

        for(i in sofas.indices){
            sofas[i].hasLegs()
        }

        for(i in mesas.indices){
            mesas[i].hasLegs()
        }
    }


}