package b.operator;

public class OperatorConditional {
    public static void main(String[] args) {
        OperatorConditional operatorConditional = new OperatorConditional();
        operatorConditional.condition();
    }

    public void condition() {
        boolean x = true;
        boolean y = true;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println("-----");
        x = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println("-----");
        y = false;
        System.out.println(x && y);
        System.out.println(x || y);
    }
}