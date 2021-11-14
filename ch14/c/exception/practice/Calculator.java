package c.exception.practice;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            calculator.printDivide(1,2);
            calculator.printDivide(1,0); // 0으로 나눌 수 없는데 나누고 있어서 Infinity 값을 출력
        } catch (DivideZeroException ex) {
            System.out.println(ex.getMessage());
        }

    }
    public void printDivide(double d1, double d2) throws DivideZeroException {
        if (d2 == 0) throw new DivideZeroException("Second value can't be Zero");
        else {
            double result = d1 / d2;
            System.out.println(result);
        }
    }
}