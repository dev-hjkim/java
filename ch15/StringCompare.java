public class StringCompare {
    public static void main(String[] args) {
        StringCompare stringCompare = new StringCompare();
        stringCompare.checkString();
    }

    public void checkString() {
        String text = "You must know String class.";
        String text2 = "가나다";
        System.out.println("text.length() = " + text.length());
        System.out.println("text2.length() = " + text2.length());
    }
}