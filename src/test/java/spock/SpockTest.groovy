package spock

import spock.lang.Specification

class SpockTest extends Specification {
    def "Spock working?"() {
        expect:
        1 + 1 == 2
    }
}
