package hackerrank.interview;

import java.util.HashMap;

public class SockMerchant {
    public int solution(int n, int[] ar) {
        HashMap<Integer, Integer> socks = new HashMap<>();
        int socksCount = 0;

        for (Integer el : ar) {
            Integer sockCount = socks.get(el);
            if (sockCount == null) {
                socks.put(el, 1);
            } else if (sockCount == 1) {
                socksCount++;
                socks.put(el, null);
            }
        }
        return socksCount;
    }
}
