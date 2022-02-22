package ch10_11;

/**
 * @author shenjie
 * @version 1.0
 */
public class H02 {
}

class Frock {
    private static int currentNum = 100000;
    private int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getNextNum() {
        return currentNum += 100;
    }

    public Frock() {
        this.serialNumber = getNextNum();
    }
}

class TestFrock {
    public static void main(String[] args) {

        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());

        Frock frock1 = new Frock();
        System.out.println(frock1.getSerialNumber());
        Frock frock2 = new Frock();
        System.out.println(frock2.getSerialNumber());
        Frock frock3 = new Frock();
        System.out.println(frock3.getSerialNumber());

    }
}