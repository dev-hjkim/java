package c.exception.practice;

public class DivideZeroException extends Exception {
    public DivideZeroException() {
        super();
    }

    public DivideZeroException(String message) {
        super(message);
    }
}