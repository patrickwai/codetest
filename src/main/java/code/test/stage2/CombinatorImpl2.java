package code.test.stage2;

import code.test.DefaultCombinator;
import code.test.IllegalNumberException;

import java.util.ArrayList;
import java.util.List;

public class CombinatorImpl2 extends DefaultCombinator {
    @Override
    public String[] doCombination(int[] nums) {
        List<String[]> selections = new ArrayList<>();

        for (int n : nums) {
            if (n < 0 || n > 99) {
                throw new IllegalNumberException("The number must be in range(0,99)");
            }
            if (n > 9 && n <= 99) {
                int[] ds = splitNumber(n);
                selections.add(doCombination(ds));
                continue;
            }
            selections.add(MAPPINGS[n]);
        }

        return selections.stream().reduce(new String[]{}, this::combine);
    }
}
