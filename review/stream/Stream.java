import java.util.List;
import java.util.ArrayList;

public class Stream {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        for (int i=1; i<11; i++) {
            lst.add(i);
        }

        int res = lst.parallelStream().mapToInt(i -> i.intValue()).sum();
        System.out.println(res);
    }
}