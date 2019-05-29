package code.test.stage1;

import code.test.Combinator;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CombinatorImpl1Test {

    @Test
    public void testDoCombination() {
        Combinator combinator = new CombinatorImpl1();

        int[] arr = new int[]{2, 3};

        String[] result = combinator.doCombination(arr);
        assertArrayEquals("", new String[]{
                    "ad", "ae", "af",
                    "bd", "be", "bf",
                    "cd", "ce", "cf"
                },
                result);

    }
}