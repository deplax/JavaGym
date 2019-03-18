package hackerrank.algorithm;

public class DiagonalDifference {
    public int solution(int[][] arr) {
        int diagonal = 0;
        int diagonalRev = 0;

        for (int i = 0; i < arr.length; i++) {
            diagonal += arr[i][i];
            diagonalRev += arr[i][arr.length - i - 1];
        }

        return Math.abs(diagonal - diagonalRev);
    }
}
