package javastatic

import spock.lang.Specification

class StaticTest extends Specification {
    def "static variable share" () {
        given:
        StaticVariable staticFoo1 = new StaticVariable()
        StaticVariable staticFoo2 = new StaticVariable()

        when:
        staticFoo1.setCount(10)
        staticFoo2.setCount(20)

        then:
        staticFoo1.getCount() == staticFoo2.getCount()
        staticFoo1.getCount() == 20
    }
}
