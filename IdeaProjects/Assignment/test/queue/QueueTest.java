package queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QueueTest {
    @Test
    public void testThatQueueExist(){
        Queue queue = new Queue();
        assertEquals(0, queue.exist());
    }
//    @Test
//    public void testThatQueueIsEmpty() {
//        Queue queue = new Queue();
//        assertTrue(queue.isEmpty());
//    }

}
