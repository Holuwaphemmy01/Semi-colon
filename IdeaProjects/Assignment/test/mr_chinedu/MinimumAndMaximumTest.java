package mr_chinedu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

public class MinimumAndMaximumTest {
    @Test
    public void testThatArrayReturnTheMaximumAndMinimumNumber() {
        MinimumAndMaximum minimumAndMaximum = new MinimumAndMaximum();
        int [] number = {3, 3, 6, 7, 8};
        int [] newNumber = {3, 8};
        Assertions.assertArrayEquals(newNumber, minimumAndMaximum.minimumAndMaximum(number));
    }
}
