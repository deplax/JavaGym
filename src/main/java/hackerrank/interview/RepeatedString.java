package hackerrank.interview;

public class RepeatedString {
    private long getCharacterCount(String str, Integer subCount) {
        if (str.isEmpty()) {
            return 0;
        }

        String subStr = str.substring(0, subCount);
//        Character first = str.charAt(0);
        Character first = 'a';
        int count = 0;

        for (Character ch : subStr.toCharArray()) {
            if (ch.equals(first)) {
                count++;
            }
        }

        return count;
    }

    public long solution(String s, long n) {
        long countCharacter = getCharacterCount(s, s.length());
        return n / s.length() * countCharacter + getCharacterCount(s, (int) (n % s.length()));
    }
}
