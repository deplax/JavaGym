package hackerrank.interview

import spock.lang.Specification

class RepeatedStringTest extends Specification {
    def "Solution Test"() {
        expect:
        RepeatedString problem = new RepeatedString()

        result == problem.solution(str, n as long)

        where:
        str     | n             | result
        "aba"   | 10            | 7 as long
        "a"     | 1000000000000 | 1000000000000 as long
        "abbaa" | 3             | 1 as long
        "bba"   | 3             | 1 as long

    }
}