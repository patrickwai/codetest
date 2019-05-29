package code.test.stage2;

import code.test.Combinator;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class CombinatorImpl2Test {

    @Test
    public void testDoCombination() {
        Combinator combinator = new CombinatorImpl2();

        int[] arr = new int[]{99};

        String[] result = combinator.doCombination(arr);
        System.out.println(Arrays.asList(result));
        assertArrayEquals("", new String[]{
                    "ww", "wx", "wy", "wz",
                    "xw", "xx", "xy", "xz",
                    "yw", "yx", "yy", "yz",
                    "zw", "zx", "zy", "zz"
                },
                result);
    }
}

