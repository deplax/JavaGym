package hackerrank.interview

import spock.lang.Specification

class ArrayProblemTest extends Specification {
    def "array2D Test"() {
        expect:
        ArrayProblem problem = new ArrayProblem()
        result == problem.array2D(arr as int[][])

        where:
        arr                  | result
        [[1, 1, 1, 0, 0, 0],
         [0, 1, 0, 0, 0, 0],
         [1, 1, 1, 0, 0, 0],
         [0, 0, 2, 4, 4, 0],
         [0, 0, 0, 2, 0, 0],
         [0, 0, 1, 2, 4, 0]] | 19
    }

    def "rotLeft Test"() {
        expect:
        ArrayProblem problem = new ArrayProblem()
        result as int[] == problem.rotLeft(arr as int[], n)

        where:
        arr             | n | result
        [1, 2, 3, 4, 5] | 4 | [5, 1, 2, 3, 4]
    }

    def "New Year Chaos"() {
        expect:
        ArrayProblem problem = new ArrayProblem()
        result as int[] == problem.minimumBribes(arr as int[])

        where:
        arr             | result
        [1, 2, 3, 4, 5] | [5, 1, 2, 3, 4]
    }
}
