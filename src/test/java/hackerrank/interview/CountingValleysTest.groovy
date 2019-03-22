package hackerrank.interview

import spock.lang.Specification

class CountingValleysTest extends Specification {
    def "Solution Test"() {
        expect:
        CountingValleys problem = new CountingValleys()

        result == problem.solution(cnt, str)

        where:
        cnt | str        | result
        8   | "UDDDUDUU" | 1
        8   | "UDDDUUDU" | 2
    }
}
