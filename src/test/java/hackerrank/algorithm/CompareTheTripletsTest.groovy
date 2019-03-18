package hackerrank.algorithm

import spock.lang.Specification

class CompareTheTripletsTest extends Specification {
    def "Solution Test"() {
        expect:
        CompareTheTriplets problem = new CompareTheTriplets()

        result == problem.compareTriplets(listA, listB)

        where:
        listA        | listB       | result
        [5, 6, 7]    | [3, 6, 10]  | [1, 1]
        [17, 28, 30] | [99, 16, 8] | [2, 1]
    }
}
