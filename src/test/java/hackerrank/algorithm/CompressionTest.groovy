package hackerrank.algorithm

import spock.lang.Specification

class CompressionTest extends Specification {
    def "Solution Test"() {
        expect:
        Compression problem = new Compression()

        result == problem.compressedString(str)

        where:
        str        | result
        "abc"      | "abc"
        "abaabbbc" | "aba2b3c"
        "wwww"     | "w4"
        "aabbbb"   | "a2b4"
    }
}
