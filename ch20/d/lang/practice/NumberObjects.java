package d.lang.practice;

public class NumberObjects {
    public static void main(String[] args) {
        NumberObjects numberObjects = new NumberObjects();
        numberObjects.parseLong("r1024");
        numberObjects.parseLong("1024");

        numberObjects.printOtherBase(1024);
    }

    public long parseLong(String data) {
        long lData = -1;
        try {
            lData = Long.parseLong(data);
        } catch (Exception ex) {
            System.out.println(data + " is not a number.");
            return -1;
        }

        System.out.println(lData);
        return lData;
    }

    public void printOtherBase(long value) {
        System.out.println("Original:"+value);
        System.out.println("Binary  :"+Long.toBinaryString(value));
        System.out.println("Hex     :"+Long.toHexString(value));
        System.out.println("Octal   :"+Long.toOctalString(value));
    }
}