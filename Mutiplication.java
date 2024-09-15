import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MultiplicationTest {
  
  @Test
  public void testTheCalculatorCanMultiply(){

            //given
            Multiplication multiplication = new Multiplication();
      
            //when
            int result = multiplication.multiply(10, 10);
            //assert
            assertEquals(100, result);


  }

}



public class Multiplication{
  public int multiply(int firstNumber, int secondNumber){
  
  int multiply =0;
  
  	for (int count = 1; count <= secondNumber; count++){
      multiply += firstNumber;}
      
      if (secondNumber < 0){
        multiply = -multiply;}
        return multiply;

  }
}