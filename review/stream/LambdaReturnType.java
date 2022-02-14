public class LambdaReturnType {
    public static void main(String[] args) {
        MyFunctionalInterface mfi = todo();

        int result = mfi.runSomething(3);

        System.out.println(result); // 9
    }

    public static MyFunctionalInterface todo() {
        return num -> num * num;    // runSomething 함수가 lambda로
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        public abstract int runSomething(int count);
    }
}