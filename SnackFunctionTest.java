import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SnackFunctionTest{


@Test
public void testForRidersWage(){

SnackFunction1 snackFunction = new SnackFunction1();

int result = snackFunction.ridersWage(70);

assertEquals(40000, result);


}




		}