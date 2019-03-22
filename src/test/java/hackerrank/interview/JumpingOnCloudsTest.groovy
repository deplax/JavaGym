package hackerrank.interview

import spock.lang.Specification

class JumpingOnCloudsTest extends Specification {
    def "Solution Test"() {
        expect:
        JumpingOnClouds problem = new JumpingOnClouds()

        result == problem.solution(arr as int[])

        where:
        arr                   | result
        [0, 0, 1, 0, 0, 1, 0] | 4
        [0, 0, 0, 0, 1, 0]    | 3
    }
}
