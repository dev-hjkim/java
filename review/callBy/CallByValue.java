public class CallByValue {
    public static void main(String[] args) {
        int i1 = 1;
        String s1 = "abc";

        changeValue(i1, s1);
        System.out.println(i1);
        System.out.println(s1);
    }

    static void changeValue(int i, String s) {
        i = 2;
        s = "def";
        System.out.println(i);
        System.out.println(s);
    }
}