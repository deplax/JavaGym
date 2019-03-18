package hackerrank.algorithm;

import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

    // Complete the compareTriplets function below.
    public List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int winA = 0;
        int winB = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                winA++;
            } else if (a.get(i) < b.get(i)) {
                winB++;
            }
        }
        return Arrays.asList(winA, winB);
    }
}
