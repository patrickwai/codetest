package code.test;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class DefaultCombinatorTest {

    @Test
    public void doCombination() {
    }

    @Test
    public void testCombine() {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"d", "e", "f"};

        DefaultCombinator combinator = new DefaultCombinator();

        String[] result = combinator.combine(s1, s2);

        System.out.println(Arrays.asList(result));

        assertArrayEquals("", new String[]{"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"}, result);

        s1 = new String[]{};
        result = combinator.combine(s1, s2);
        System.out.println(Arrays.asList(result));
        assertArrayEquals("", new String[]{"d", "e", "f"}, result);

        s1 = new String[]{"a", "b", "c"};
        s2 = new String[] {};
        result = combinator.combine(s1, s2);
        System.out.println(Arrays.asList(result));
        assertArrayEquals("", new String[]{"a", "b", "c"}, result);
    }
}