package airCondition;

import aircondition.AirCondition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {
    private AirCondition airCondition;
    @BeforeEach
        public void setup(){
         airCondition = new AirCondition();
    }
    @Test
    public void testThatWhenISwitchOnAirConditionItWillSwitchOn(){
        assertEquals("on", airCondition.switchOnAircondition("ON"));
    }

    @Test
    public void testThatWhenIDontUseThePowerOnKeyTheAirConditionWillBeOff(){
        assertEquals("off", airCondition.switchOnAircondition("decrease"));
    }

    @Test
    public void testThatWhenMyAirConditonIsOnAndIEnterThePowerOffKeyItWillOff(){
        assertEquals("on", airCondition.switchOnAircondition("ON"));
        assertEquals("off", airCondition.switchOffAircondition("OFF"));
    }

    @Test
    public void testThatWhenMyAirConditionIsOnAndIEnterAnyKeyToOffItShouldNotOff(){
        assertEquals("on", airCondition.switchOnAircondition("ON"));
        assertEquals("on", airCondition.switchOffAircondition("thew"));
        assertEquals("off", airCondition.switchOffAircondition("off"));
    }

    @Test
    public void testThatWhenIncreaseTheAirConditionItShouldIncrease(){
        assertEquals("on", airCondition.switchOnAircondition("ON"));
        assertEquals(17, airCondition.increase(1));
        assertEquals(18, airCondition.increase(1));
        assertEquals("off", airCondition.switchOffAircondition("Off"));
    }

    @Test
    public void testThatWhenIncreaseIsGreaterThanOneThatAirConditionShouldNotIncrease(){
        assertEquals("on", airCondition.switchOnAircondition("ON"));
        assertEquals(16, airCondition.increase(2));
        assertEquals(17, airCondition.increase(1));
        assertEquals(17, airCondition.increase(3));
        assertEquals(18, airCondition.increase(1));
        assertEquals("off", airCondition.switchOffAircondition("Off"));
    }

    @Test
    public void testThatAirConditionIncrementWillNotPass30(){
        assertEquals("on", airCondition.switchOnAircondition("ON"));
        assertEquals(17, airCondition.increase(1));
        assertEquals(18, airCondition.increase(1));
        assertEquals(19, airCondition.increase(1));
        assertEquals(20, airCondition.increase(1));
        assertEquals(21, airCondition.increase(1));
        assertEquals(22, airCondition.increase(1));
        assertEquals(23, airCondition.increase(1));
        assertEquals(24, airCondition.increase(1));
        assertEquals(25, airCondition.increase(1));
        assertEquals(26, airCondition.increase(1));
        assertEquals(27, airCondition.increase(1));
        assertEquals(28, airCondition.increase(1));
        assertEquals(29, airCondition.increase(1));
        assertEquals(30, airCondition.increase(1));
        assertEquals(30, airCondition.increase(1));
        assertEquals(30, airCondition.increase(1));
        assertEquals("off", airCondition.switchOffAircondition("Off"));
    }
    @Test
    public void testThatWhenDecreaseTheAirConditionItShouldDecreaseByOne(){
        assertEquals("on", airCondition.switchOnAircondition("ON"));
        assertEquals(17, airCondition.increase(1));
        assertEquals(18, airCondition.increase(1));
        assertEquals(17, airCondition.decrease(1));
        assertEquals("off", airCondition.switchOffAircondition("Off"));
    }
    @Test
    public void testThatWhenDecreaseIsGreaterThanOneThatAirConditonShouldNotDecrease (){
        assertEquals("on", airCondition.switchOnAircondition("ON"));
        assertEquals(16, airCondition.decrease(2));
        assertEquals(17, airCondition.increase(1));
        assertEquals(18, airCondition.increase(1));
        assertEquals(18, airCondition.decrease(4));
        assertEquals(17, airCondition.decrease(1));
        assertEquals(16, airCondition.decrease(1));
        assertEquals("off", airCondition.switchOffAircondition("Off"));
    }

    @Test
    public void testThatCheckThatDecrementDoesNOtPass16(){
        assertEquals("on", airCondition.switchOnAircondition("ON"));
        assertEquals(17, airCondition.increase(1));
        assertEquals(16, airCondition.decrease(1));
        assertEquals(16, airCondition.decrease(1));
        assertEquals("off", airCondition.switchOffAircondition("Off"));
    }

}
