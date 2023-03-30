package TareaTema4;

public class SmartMain {
    public static void main(String[] args) {
        SmartPhone tele1 = new SmartPhone(45,55,"android",4444234,"Samsung");
        SmartWatch reloj1 = new SmartWatch(10,5,"IOS",4,"iWatch");
        System.out.println(tele1.aString());
        System.out.println(reloj1.aString());


    }
}
