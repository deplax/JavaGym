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

        /* 각 객체 내부의 static 변수만 동일하며, 서로 다른 객체이다. */
        staticFoo1.toString() != staticFoo2.toString()
    }
}
