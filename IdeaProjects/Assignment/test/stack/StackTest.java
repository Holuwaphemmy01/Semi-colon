package stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class StackTest {
    Stack stack;
    @BeforeEach
    public void setUp() {
         stack = new Stack(3);
    }

    @Test
    public void stack_Is_Empty() {
        Assertions.assertTrue(stack.isEmpty());
    }
    @Test
    public void stack_Is_NotEmpty() {
        stack.push("Oluwafemi");
        Assertions.assertFalse(stack.isEmpty());
    }
    @Test
    public void PushX_And_SizeIs1(){
        stack.push("Oluwafemi");
        Assertions.assertEquals(1, stack.count());
    }
   @ Test
   public void PushX_And_PopY(){
        stack.push("Oluwafemi");
        stack.pop();
        Assertions.assertTrue(stack.isEmpty());
   }

   @Test
    public void PushXYZ_And_SizeIs3(){
        stack.push("Oluwafemi");
        stack.push("femzy");
        stack.push("Akinzo");
        Assertions.assertEquals(3, stack.count());
   }
   @Test
    public void PushXYZ_And_PopZ(){
        stack.push("Oluwafemi");
        stack.push("femzy");
        stack.push("Akinzo");
        stack.pop();
        Assertions.assertEquals(2, stack.count());
   }
   @Test
    public void Pop_When_StackIsEmpty(){
        stack.pop();
        Assertions.assertTrue(stack.isEmpty());
   }

   @Test
    public void PushXYZ_And_PopZYX() {
       stack.push("Oluwafemi");
       stack.push("femzy");
       stack.push("Akinzo");
       Assertions.assertEquals("Akinzo", stack.pop());
       Assertions.assertEquals("femzy", stack.pop());
       Assertions.assertEquals("Oluwafemi", stack.pop());

   }

    @Test
    public void PushXYZ_And_Check_If_Stack_Is_Full(){
        stack.push("Oluwafemi");
        stack.push("femzy");
        stack.push("Akinzo");
        Assertions.assertTrue(stack.isFull());
    }

    @Test
    public void PushXY_And_Check_If_Stack_Is_Full(){
        stack.push("Oluwafemi");
        stack.push("femzy");
        Assertions.assertFalse(stack.isFull());
    }

    @Test
    public void pushXYZA_And_Check_If_Stack_Will_AcceptA(){
        stack.push("Oluwafemi");
        stack.push("femzy");
        stack.push("Akinzo");
        Assertions.assertTrue(stack.push("Akin"));
        Assertions.assertTrue(stack.isFull());
    }
}
