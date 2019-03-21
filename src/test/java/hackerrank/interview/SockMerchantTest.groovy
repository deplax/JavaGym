package hackerrank.interview

import spock.lang.Specification

class SockMerchantTest extends Specification {
    def "Solution Test"() {
        expect:
        SockMerchant problem = new SockMerchant()

        result == problem.solution(cnt, arr)

        where:
        cnt | arr                                           | result
        9   | [10, 20, 20, 10, 10, 30, 50, 10, 20] as int[] | 3
    }
}
