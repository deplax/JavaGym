package hackerrank.algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class PlusMinus {

    private enum Type {
        POSITIVE,
        NEGATIVE,
        ZERO
    }

    private Type classifier(Integer num) {
        if (num > 0) return Type.POSITIVE;
        if (num < 0) return Type.NEGATIVE;
        return Type.ZERO;
    }

    public List<String> solution(int[] arr) {
        Map<Type, List<Integer>> result = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.groupingBy(this::classifier));

        String pos = String.format("%.6f", (float) Optional.ofNullable(result.get(Type.POSITIVE)).orElse(Collections.EMPTY_LIST).size() / arr.length);
        String neg = String.format("%.6f", (float) Optional.ofNullable(result.get(Type.NEGATIVE)).orElse(Collections.EMPTY_LIST).size() / arr.length);
        String zero = String.format("%.6f", (float) Optional.ofNullable(result.get(Type.ZERO)).orElse(Collections.EMPTY_LIST).size()/ arr.length);


        System.out.println(pos);
        System.out.println(neg);
        System.out.println(zero);

        return Arrays.asList(pos, neg, zero);
    }
}
