package queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QueueTest {
    private Queue queue;
    @BeforeEach
    public void setUp() {
        queue = new Queue(3);
    }

    @Test
    public void testThatQueueExist(){
        assertEquals(0, queue.exist());
    }
    @Test
    public void testThatQueueIsEmpty(){
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testThatQueueContainsOneElement(){
        assertTrue( queue.enqueue("femzy"));
    }

    @Test
    public void testThatQueueContainOneElementAndSizeIsOne(){
        assertTrue( queue.enqueue("femzy"));
        assertEquals(1, queue.count());
    }

    @Test
    public void testThatCanAddOneElementAndRemoveOneElement(){
        assertTrue(queue.enqueue("femzy"));
        queue.dequeue();
    }


    @Test
    public void testThatCanAddTwoElementsAndRemoveOneElementAndElementRemainingIsOne(){
        assertTrue(queue.enqueue("femzy"));
        assertTrue(queue.enqueue("akinzo"));
        queue.dequeue();
        assertEquals(1, queue.count());
    }


    @Test
    public void testThatCanAddElementsXYAndRemoveOneElementAndGiveElementX(){
        assertTrue(queue.enqueue("femzy"));
        assertTrue(queue.enqueue("Semilore"));
        assertEquals("femzy", queue.dequeue());
    }

    @Test
    public void testThatcanAddElementsXYZAndRemoveElementXYZ(){
        assertTrue(queue.enqueue("femzy"));
        assertTrue(queue.enqueue("Semilore"));
        assertTrue(queue.enqueue("adedapo"));
        assertEquals("femzy", queue.dequeue());
        assertEquals("Semilore", queue.dequeue());
        assertEquals("adedapo", queue.dequeue());
    }
}
