package code.test;

import java.util.ArrayList;
import java.util.List;

public class DefaultCombinator implements Combinator {
    protected static final String[][] MAPPINGS = new String[][]{
            {},
            {},
            {"a", "b", "c"},
            {"d", "e", "f"},
            {"g", "h", "i"},
            {"j", "k", "l"},
            {"m", "n", "o"},
            {"p", "q", "r", "s"},
            {"t", "u", "v"},
            {"w", "x", "y", "z"}
    };

    public String[] doCombination(int[] nums) {
        List<String[]> mm = new ArrayList<>();

        for (int n : nums) {
            if (n > 9 && n < 99) {
                int[] ds = splitNumber(n);
                mm.add(doCombination(ds));
                continue;
            }
            mm.add(MAPPINGS[n]);
        }

        return mm.stream().reduce(new String[]{}, this::combine);
    }

    protected String[] combine(String[] src1, String[] src2) {
        if (src1.length == 0) {
            return src2;
        }

        if (src2.length == 0) {
            return src1;
        }


        String[] result = new String[src1.length * src2.length];

        int count = 0;
        for (String s1 : src1) {
            for (String s2 : src2) {
                result[count] = s1 + s2;
                count++;
            }
        }

        return result;
    }


    protected static int[] splitNumber(int number) {
        if (number > 99 || number < 10) {
            throw new IllegalNumberException();
        }
        int[] nums = new int[2];
        nums[0] = number / 10;
        nums[1] = number % 10;

        return nums;
    }
}
