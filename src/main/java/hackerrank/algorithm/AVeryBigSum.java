package hackerrank.algorithm;

import java.util.Arrays;

public class AVeryBigSum {
    public long solution(long[] ar) {
        return Arrays.stream(ar).sum();
    }
}
