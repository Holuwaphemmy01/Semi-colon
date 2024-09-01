package set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    Set set;
    @BeforeEach
    public void setUp() {
        set = new Set(3);
    }

    @Test
    public void testThatSetIsEmpty() {
        assertTrue(set.isEmpty());
    }

    @Test
    public void testThatSetIsNotEmpty() {
        Set set = new Set(3);
        set.add(1);
        assertFalse(set.isEmpty());
    }

    @Test
    public void testThatSetCanAddOneElementAndCountElementInsideTheSet() {
        set.add(5);
        assertEquals(1, set.count());
    }

    @Test
    public void testThatSetAddTwoElementAndCountElementInsideTheSet() {
        set.add(5);
        set.add(6);
        assertEquals(2, set.count());
    }

    @Test
    public void testThatSetCanAddTwoElementAndRemoveOneElementAndCountElementInsideTheSet() {
        set.add(5);
        set.add(6);
        set.remove(5);
        assertEquals(1, set.count());
    }

    @Test
    public void testThatSetCanNotAddTwoSameElement() {
        set.add(5);
        set.add(6);
        assertThrows(IllegalArgumentException.class, () -> {
            set.add(5);
        });
    }

    @Test
    public void testThatSetIsFull(){
        set.add(5);
        set.add(6);
        set.add(7);
        assertThrows(IndexOutOfBoundsException.class, () -> {set.add(8);});
    }
    @Test
    public void testThatChecksIfThereIsAnElementInsideTheSet() {
        set.add(5);
        set.add(6);
        set.add(7);
        assertTrue(set.check(6));
    }
    @Test
    public void testThatChecksIfAnElementDidNotExistInTheSet() {
        set.add(5);
        set.add(6);
        set.add(7);
        assertFalse(set.check(9));
    }

    @Test
    public void testThatCanRemoveAnElementFromTheSet() {
        set.add(5);
        set.add(6);
        assertEquals(5, set.remove(5));
    }

    @Test
    public void testThatCanNotRemoveAnElementThatDoesNotExistInTheSet() {
        set.add(5);
        set.add(6);
        assertThrows(IllegalArgumentException.class, () -> {set.remove(7);});
    }

}

