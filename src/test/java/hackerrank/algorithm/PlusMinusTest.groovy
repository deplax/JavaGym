package hackerrank.algorithm

import spock.lang.Specification

class PlusMinusTest extends Specification {
    def "Solution Test"() {
        expect:
        PlusMinus problem = new PlusMinus()

        result == problem.solution(arr)

        where:
        arr                                | result
        [-4, 3, -9, 0, 4, 1] as int[]      | ["0.500000", "0.333333", "0.166667"]
        [1, -2, -7, 9, 1, -8, -5] as int[] | ["0.428571", "0.571429", "0.000000"]
    }
}
