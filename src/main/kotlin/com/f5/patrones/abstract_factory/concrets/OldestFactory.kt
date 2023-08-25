package com.f5.patrones.abstract_factory.concrets

import com.f5.patrones.abstract_factory.concrets.products.oldest.*
import com.f5.patrones.abstract_factory.interfaces.products.*
import com.f5.patrones.abstract_factory.interfaces.FurnitureFabric

class OldestFactory: FurnitureFabric {
    override fun createChair(): Chair {
        return OldestChair()
    }

    override fun createCoach(): Couch {
        return OldestCouch()
    }

    override fun createTable(): Table {
        return OldestTable()
    }
}