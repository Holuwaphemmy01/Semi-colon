package aircondition;

public class AirCondition {
    private final String powerOn = "on";
    private final String powerOff = "off";
    private  int increase = 16;

    public  String switchOnAircondition(String powerOnKey){
        if(this.powerOn.equalsIgnoreCase(powerOnKey)) return powerOn;
        else return powerOff;
    }


    public String switchOffAircondition(String powerOffKey) {
        if(this.powerOff.equalsIgnoreCase(powerOffKey)) return powerOff;
        else return powerOn;
    }

    public int increase(int increase){
        boolean airConditionIncrement = increase == 1;
        if(airConditionIncrement) {
            this.increase += increase;
            if(this.increase >= 30) return 30;
            else return this.increase;
        }
        else return this.increase;
    }

    public int decrease(int decrease) {
        if (decrease == 1) {
            if(this.increase <= 16) return 16;
            return this.increase -= decrease;
        } else {
            return this.increase;
        }
    }


}
