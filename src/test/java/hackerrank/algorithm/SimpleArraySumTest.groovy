package hackerrank.algorithm

import spock.lang.Specification

class SimpleArraySumTest extends Specification {
    def "Solution Test"() {
        expect:
        SimpleArraySum problem = new SimpleArraySum()

        result == problem.simpleArraySum(intArray)

        where:
        intArray                      | result
        [1, 2, 3, 4, 10, 11] as int[] | 31
    }
}
