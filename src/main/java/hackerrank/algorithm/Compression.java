package hackerrank.algorithm;

public class Compression {
    private static final int INIT_VALUE = 1;

    public String compressedString(String message) {

        StringBuilder result = new StringBuilder();
        Character prevCharacter = null;
        int continueCount = INIT_VALUE;

        for (int i = 0; i < message.length(); i++) {
            Character currentCharacter = message.charAt(i);

            if (i == 0) {
                result.append(currentCharacter.toString());
                prevCharacter = currentCharacter;
                continue;
            }

            if (currentCharacter.equals(prevCharacter)) {
                continueCount++;
            } else if (continueCount != INIT_VALUE) {
                result.append(continueCount);
                result.append(currentCharacter.toString());
                continueCount = INIT_VALUE;
            } else {
                result.append(currentCharacter.toString());
            }

            if (continueCount != INIT_VALUE && i == message.length() - 1) {
                result.append(continueCount);
            }
            prevCharacter = currentCharacter;
        }
        return result.toString();
    }
}

