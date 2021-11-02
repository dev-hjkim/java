public class OperatorComparison {
    public static void main(String[] args) {
        OperatorComparison operatorComparison = new OperatorComparison();
        operatorComparison.comparison3();
    }

    public void comparison() {
        int intValue1 = 1;
        int intValue2 = 2;
        int intValue3 = 1;

        System.out.println(intValue1 == intValue2);
        System.out.println(intValue1 == intValue3);

        System.out.println(intValue1 != intValue2);
        System.out.println(intValue1 != intValue3);
    }

    public void comparison2() {
        char charValue = 'a';
        System.out.println(97==charValue);
        int intValue = 1;
        double doubleValue = 1.0;
        System.out.println(intValue == doubleValue);
    }

    public void comparison3() {
        boolean boolValue1 = true;
        boolean boolValue2 = false;
        boolean boolValue3 = true;

        System.out.println(boolValue1 == boolValue2);
        System.out.println(boolValue1 == boolValue3);

        System.out.println(boolValue1 != boolValue2);
        System.out.println(boolValue1 != boolValue3);

    }

}