package hackerrank.algorithm;

import java.util.Arrays;

/* https://www.hackerrank.com/challenges/simple-array-sum/problem
*  해커랭크 사용법 익히는 중... */

public class SimpleArraySum {
    public int simpleArraySum(int[] ar) {
        return Arrays.stream(ar).sum();
    }
}
