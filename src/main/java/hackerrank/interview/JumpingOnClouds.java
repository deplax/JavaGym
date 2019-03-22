package hackerrank.interview;

public class JumpingOnClouds {
    private final static int JUMP_DISTANCE = 1;
    public int solution(int[] c) {

        int currentDistance = 0;
        int jumpCount = 0;

        for (int cloud : c) {
            if (cloud == 0 && currentDistance >= JUMP_DISTANCE) {
                jumpCount++;
                currentDistance = 0;
            } else if (cloud == 1) {
                jumpCount++;
                currentDistance = 0;
            } else {
                currentDistance += 1;
            }
        }
        return jumpCount;
    }
}
