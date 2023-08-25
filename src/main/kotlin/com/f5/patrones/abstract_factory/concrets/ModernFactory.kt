package com.f5.patrones.abstract_factory.concrets

import com.f5.patrones.abstract_factory.concrets.products.modern.*
import com.f5.patrones.abstract_factory.interfaces.products.*
import com.f5.patrones.abstract_factory.interfaces.FurnitureFabric

class ModernFactory: FurnitureFabric {

    override fun createChair(): Chair {
        return ModernChair()
    }

    override fun createCoach(): Couch {
        return ModernCouch()
    }

    override fun createTable(): Table {
        return ModernTable()
    }

}