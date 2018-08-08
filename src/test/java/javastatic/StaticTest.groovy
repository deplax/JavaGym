package javastatic

import spock.lang.Specification

class StaticTest extends Specification {
    def "static variable share"() {
        given:
        StaticVariable staticVariable1 = new StaticVariable()
        StaticVariable staticVariable2 = new StaticVariable()

        when:
        staticVariable1.setCount(10)
        staticVariable2.setCount(20)

        then:
        staticVariable1.getCount() == staticVariable2.getCount()
        staticVariable1.getCount() == 20

        /* 각 객체 내부의 static 변수만 동일하며, 서로 다른 객체이다. */
        staticVariable1.toString() != staticVariable2.toString()
    }

    def "static variable share (list)"() {
        given:
        StaticVariable staticVariable1 = new StaticVariable()
        StaticVariable staticVariable2 = new StaticVariable()

        when:
        staticVariable1.setList(new LinkedList<String>())
        staticVariable2.setList(new LinkedList<String>())
        staticVariable1.getList().add("a")
        staticVariable2.getList().add("b")

        then:
        staticVariable1.getList().get(1) == "b"
        staticVariable1.getList() == staticVariable2.getList()

        /* 해시코드가 메모리 주소를 말하는 것은 아니다. */
        System.identityHashCode(staticVariable1.getList()) == System.identityHashCode(staticVariable2.getList())
    }

    def "static block"() {
        given:
        StaticBlock s1 = new StaticBlock()
        StaticBlock s2 = new StaticBlock()

        /*
        1.static init
        2.instance init
        3.init
        2.instance init
        3.init
        * */
    }
}
