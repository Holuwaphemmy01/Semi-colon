package bike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {
    private Bike bike;
    @BeforeEach
    public void setUp() {
        bike = new Bike();
    }

    @Test
    public void testThatCheckIfBikeIsTurnedOn(){
        assertEquals("on", bike.powerOn("on"));
    }

    @Test
    public void testThatCheckIfPowerButtonNotUsedAndIfTheBikeIsTurnedOn(){
        assertEquals("off", bike.powerOn("increase"));
        assertEquals("on", bike.powerOn("on"));
    }

    @Test
    public void testThatCheckIfBikeIsTurnedOff(){
        assertEquals("on", bike.powerOn("ON"));
        assertEquals("off", bike.powerOff("off"));
    }

    @Test
    public void testThatCheckIfPowerButtonNotUsedAndIfTheBikeIsTurnedOff(){
        assertEquals("on", bike.powerOn("ON"));
        assertEquals("on", bike.powerOff("brake"));
        assertEquals("off", bike.powerOff("off"));
    }

    @Test
    public void testThatCheckIfGearOneIncreasesByOne(){
        assertEquals("on", bike.powerOn("on"));
        assertEquals(1, bike.gearOne(1));
        assertEquals(2, bike.gearOne(1));
        assertEquals("off", bike.powerOff("off"));
    }

    @Test
    public void testThatCheckIfGearOneDoesNotIncreaseByAnyValueOtherThanOne(){
        assertEquals("on", bike.powerOn("on"));
        assertEquals(1, bike.gearOne(1));
        assertEquals(1, bike.gearOne(2));
        assertEquals("off", bike.powerOff("off"));
    }
    @Test
    public void testThatCheckForGearOneDecelerateByOne(){
        assertEquals("on", bike.powerOn("on"));
        assertEquals(1, bike.gearOne(1));
        assertEquals(2, bike.gearOne(1));
        assertEquals(1, bike.gearOneDecelerate(1));
        assertEquals("off", bike.powerOff("off"));
    }

    @Test
    public void testThatCheckIfGearOneDoesNotDecelerateByAnyValues(){
        assertEquals("on", bike.powerOn("on"));
        assertEquals(1, bike.gearOne(1));
        assertEquals(1, bike.gearOneDecelerate(3));
        assertEquals(1, bike.gearOneDecelerate(3));
        assertEquals("off", bike.powerOff("off"));
    }
    @Test
    public void testThatCheckIfGearTwoIncreasesByTwo(){
        assertEquals("on", bike.powerOn("on"));
        assertEquals(22, bike.gearTwo(2));
        assertEquals(24, bike.gearTwo(2));
        assertEquals(26, bike.gearTwo(2));
        assertEquals("off", bike.powerOff("off"));
    }

    @Test
    public void testThatCheckIfGearTwoDoesNotIncreaseByAnyValueOtherThanTwo(){
        assertEquals("on", bike.powerOn("on"));
        assertEquals(22, bike.gearTwo(2));
        assertEquals(24, bike.gearTwo(2));
        assertEquals(24, bike.gearTwo(5));
        assertEquals(26, bike.gearTwo(2));
        assertEquals("off", bike.powerOff("off"));
    }

    @Test
    public void testThatCheckIfGearTwoDecelerateByTwo(){
        assertEquals("on", bike.powerOn("on"));
        assertEquals(22, bike.gearTwo(2));
        assertEquals(24, bike.gearTwo(2));
        assertEquals(26, bike.gearTwo(2));
        assertEquals(24, bike.gearTwoDecelerate(2));
        assertEquals(22, bike.gearTwoDecelerate(2));
        assertEquals("off", bike.powerOff("off"));
    }

    @Test
    public void testThatCheckIfGearTwoDoesNotDecelerateByAnyValues(){
        assertEquals("on", bike.powerOn("on"));
        assertEquals(22, bike.gearTwo(2));
        assertEquals(24, bike.gearTwo(2));
        assertEquals(24, bike.gearTwoDecelerate(1));
        assertEquals(22, bike.gearTwoDecelerate(2));
        assertEquals("off", bike.powerOff("off"));
    }

    @Test
    public void testThatCheckIfGearThreeIncreasesByThree(){
        assertEquals("on", bike.powerOn("on"));
        assertEquals(33, bike.gearThree(3));
        assertEquals(36, bike.gearThree(3));
        assertEquals("off", bike.powerOff("off"));
    }

    @Test
    public void testThatCheckIfGearThreeDoesNotIncreaseByAnyValueOtherThanThree(){
        assertEquals("on", bike.powerOn("on"));
        assertEquals(33, bike.gearThree(3));
        assertEquals(36, bike.gearThree(3));
        assertEquals(36, bike.gearThree(6));
        assertEquals(36, bike.gearThree(4));
        assertEquals("off", bike.powerOff("off"));
    }

    @Test
    public void testThatCheckIfGearThreeDecelerateByThree(){
        assertEquals("on", bike.powerOn("on"));
        assertEquals(33, bike.gearThree(3));
        assertEquals(36, bike.gearThree(3));
        assertEquals(33, bike.gearThreeDecelerate(3));
        assertEquals("off", bike.powerOff("off"));
    }

    @Test
    public void testThatCheckIfGearThreeDoesNotDecelerateByAnyValue(){
        assertEquals("on", bike.powerOn("on"));
        assertEquals(33, bike.gearThree(3));
        assertEquals(36, bike.gearThree(3));
        assertEquals(36, bike.gearThreeDecelerate(6));
        assertEquals("off", bike.powerOff("off"));
    }

    @Test
    public void testThatCheckIfGearFourIncreasesByFour(){
        assertEquals("on", bike.powerOn("on"));
        assertEquals(44, bike.gearFour(4));
        assertEquals("off", bike.powerOff("off"));
    }

    @Test
    public void testThatCheckIfGearFourDoesNotIncreaseByAnyValueOtherThanFour(){
        assertEquals("on", bike.powerOn("on"));
        assertEquals(44, bike.gearFour(4));
        assertEquals(48, bike.gearFour(4));
        assertEquals(48, bike.gearFour(6));
        assertEquals(48, bike.gearFour(2));
        assertEquals(48, bike.gearFour(9));
        assertEquals("off", bike.powerOff("off"));
    }

    @Test
    public void testThatCheckIfGearFourDecelerateByFour(){
        assertEquals("on", bike.powerOn("on"));
        assertEquals(44, bike.gearFour(4));
        assertEquals(48, bike.gearFour(4));
        assertEquals(44, bike.gearFourDecelerate(4));
        assertEquals("off", bike.powerOff("off"));
    }

    @Test
    public void testThatCheckIfGearFourDecelerateByAnyValueOtherThanFour(){
        assertEquals("on", bike.powerOn("on"));
        assertEquals(44, bike.gearFour(4));
        assertEquals(48, bike.gearFour(4));
        assertEquals(52, bike.gearFour(4));
        assertEquals(52, bike.gearFourDecelerate(6));
        assertEquals(52, bike.gearFourDecelerate(10));
        assertEquals(52, bike.gearFourDecelerate(2));
        assertEquals("off", bike.powerOff("off"));
    }
    @Test
    public void testThatCheckIfGearAutomaticallyChange(){
        assertEquals("on", bike.powerOn("on"));
        assertEquals("Gear One", bike.changingGearAutomatically(20));
        assertEquals("Gear Two", bike.changingGearAutomatically(30));
        assertEquals("Gear Three", bike.changingGearAutomatically(40));
        assertEquals("Gear Four", bike.changingGearAutomatically(160));
        assertEquals("Gear Three", bike.changingGearAutomatically(31));
        assertEquals("off", bike.powerOff("off"));
    }


}
