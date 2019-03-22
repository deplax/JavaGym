package hackerrank.interview;

public class ArrayProblem {
    private int sumHourGlass(int centerX, int centerY, int[][] arr) {
        int[][] posOffset = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, 0},
                {1, -1}, {1, 0}, {1, 1}
        };
        int sum = 0;

        for (int[] pair : posOffset) {
            sum += arr[centerX + pair[0]][centerY + pair[1]];
        }
        return sum;
    }

    public int array2D(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int x = 1; x < arr.length - 1; x++) {
            for (int y = 1; y < arr[x].length - 1; y++) {
                int sum = sumHourGlass(x, y, arr);
                if (max < sum) {
                    max = sum;
                }
            }
        }
        return max;
    }


    public int[] rotLeft(int[] a, int d) {
        int offset = d % a.length;
        int[] result = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[(i + offset) % a.length];
        }
        return result;
    }


    static void minimumBribes(int[] q) {


    }
}
