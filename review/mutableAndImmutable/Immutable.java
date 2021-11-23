public class Immutable {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str);
        System.out.println(System.identityHashCode(str));

        str += "def";
        System.out.println(str);
        System.out.println(System.identityHashCode(str));
    }
}