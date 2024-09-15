package excercise11_4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MaximumTest {
    @Test
    public void testThatMaximumClassExist(){
        Maximum maximum = new Maximum();
        assertNotNull(maximum);
    }

    @Test
    public void testThatMethodShouldReturnNUllIfListIsEmpty(){
        Maximum maximum = new Maximum();
        ArrayList<Integer> values = new ArrayList<>();
        assertEquals(0, maximum.Largest(values));
    }

    @Test
    public void testThatMethodShouldNotReturnNullIfListIsNotEmpty(){
        Maximum maximum = new Maximum();
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        assertEquals(5, maximum.Largest(values));
    }
    @Test
    public void testThatMethodShouldReturnTheLargestNumberInTheList(){
        Maximum maximum = new Maximum();
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        assertEquals(5, maximum.Largest(values));
        ArrayList<Integer> secondValues = new ArrayList<>();
        secondValues.add(1);
        secondValues.add(2);
        secondValues.add(14);
        secondValues.add(8);
        secondValues.add(5);
        assertEquals(14, maximum.Largest(secondValues));
    }

}
