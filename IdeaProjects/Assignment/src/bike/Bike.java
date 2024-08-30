package bike;

public class Bike {
            private final String switchOn = "on";
            private final String switchOff = "off";
            private int gearOne = 0;
            private int gearTwo = 20;
            private int gearThree = 30;
            private int gearFour = 40;

    public String powerOn(String switchOn){
        if (this.switchOn.equalsIgnoreCase(switchOn)) return this.switchOn;
        else return this.switchOff;
    }
    public String powerOff(String switchOff){
        if (this.switchOff.equalsIgnoreCase(switchOff)) return this.switchOff;
        else return this.switchOn;
    }

    public int gearOne(int accelerate) {
        int speed = 1;
        if (accelerate == speed){
             speed = this.gearOne += accelerate;
            return speed;
        }
        else return this.gearOne;
    }
    public int gearOneDecelerate(int decelerate) {
        int speed = 1;
        if (decelerate == speed){
            speed = this.gearOne -= decelerate;
            return speed;
        }
        else return this.gearOne;
    }

    public int gearTwo(int accelerate) {
        int speed = 2;
        if(accelerate == speed) return this.gearTwo += accelerate;
        else return this.gearTwo;
    }

    public int gearTwoDecelerate(int decelerate) {
        int speed = 2;
        if(decelerate == speed){
            speed = this.gearTwo -= decelerate;
            return speed;
         }
        else return this.gearTwo;
    }

    public int gearThree(int accelerate) {
        int speed = 3;
        if(accelerate == speed) return this.gearThree += accelerate;
        else return this.gearThree;
    }

    public int gearThreeDecelerate(int decelerate) {
        int speed = 3;
        if(decelerate == speed){
            speed = this.gearThree -= decelerate;
            return speed;
        }
        else return this.gearThree;
    }

    public int gearFour(int accelerate) {
        int speed = 4;
        if(accelerate == speed) return this.gearFour += accelerate;
        else return this.gearFour;
    }

    public int gearFourDecelerate(int decelerate) {
        int speed = 4;
        if(decelerate == speed){
            speed = this.gearFour -= decelerate;
            return speed;
        }
        else return this.gearFour;
    }

    public String changingGearAutomatically(int accelerate) {
        if(accelerate > this.gearOne && accelerate <= this.gearTwo) return "Gear One";
        else if(accelerate > this.gearTwo && accelerate <= this.gearThree) return "Gear Two";
        else if(accelerate > this.gearThree && accelerate <= this.gearFour) return "Gear Three";
        else return "Gear Four";
    }

    /*public String deceleratingGearAutomatically(int decelerate) {

    }**/

}
