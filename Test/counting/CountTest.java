package counting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CountTest {
    @Test
    public void testThatCounterExist(){
        Count count = new Count();
        assertNotNull(count);
    }

    @Test
    public void testThatCountEvenNumbersInArray(){
        Count count = new Count();
        int [] number = {1, 1, 5, 7, 1};
        int [] result = {0, 5};
        assertArrayEquals(result, count.evenAndOddCounts(number));
        int [] actual = {4, 1, 5, 7, 9};
        int [] expected = {1, 4};
        assertArrayEquals(expected, count.evenAndOddCounts(actual));
    }


}
