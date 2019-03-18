package hackerrank.algorithm

import spock.lang.Specification

class DiagonalDifferenceTest extends Specification {
    def "Solution Test"() {
        expect:
        DiagonalDifference problem = new DiagonalDifference()

        result == problem.solution(arr)

        where:
        arr                                              | result
        [[11, 2, 4], [4, 5, 6], [10, 8, -12]] as int[][] | 15 as int
    }
}
