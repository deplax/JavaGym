package hackerrank.interview;

public class CountingValleys {
    public int solution(int n, String s) {
        int height = 0;
        int valleyCount = 0;

        for (char direction : s.toCharArray()) {
            if (direction == 'U') {
                height++;
            } else if (direction == 'D') {
                height--;
            }

            if (direction == 'U' && height == 0) {
                valleyCount++;
            }
        }

        return valleyCount;
    }
}
