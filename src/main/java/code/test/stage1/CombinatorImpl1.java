package code.test.stage1;

import code.test.DefaultCombinator;
import code.test.IllegalNumberException;

import java.util.ArrayList;
import java.util.List;

public class CombinatorImpl1 extends DefaultCombinator {

    @Override
    public String[] doCombination(int[] nums) {
        List<String[]> selections = new ArrayList<>();

        for (int n : nums) {
            if (n < 0 || n > 9) {
                throw new IllegalNumberException("num must is in range(0,9)");
            }
            selections.add(MAPPINGS[n]);
        }

        return selections.stream().reduce(new String[]{}, this::combine);
    }
}
