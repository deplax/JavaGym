package hackerrank.algorithm

import spock.lang.Specification

class AVeryBigSumTest extends Specification {
    def "Solution Test"() {
        expect:
        AVeryBigSum problem = new AVeryBigSum()

        result == problem.solution(arr)

        where:
        arr                                                                    | result
        [1000000001, 1000000002, 1000000003, 1000000004, 1000000005] as long[] | 5000000015 as long
    }
}
