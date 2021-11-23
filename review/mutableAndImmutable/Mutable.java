public class Mutable {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc");
        System.out.println(stringBuilder);
        System.out.println(System.identityHashCode(stringBuilder));

        stringBuilder.append("def");
        System.out.println(stringBuilder);
        System.out.println(System.identityHashCode(stringBuilder));
    }
}