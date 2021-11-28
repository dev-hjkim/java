package d.collection.practice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {
    private final int DATA_BOUNDARY = 50;
    Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();

    public static void main(String[] args) {
        RandomNumberStatistics randomNumberStatistics = new RandomNumberStatistics();
        randomNumberStatistics.getRandomNumberStatistics();
    }

    public void getRandomNumberStatistics() {
        for(int i=0; i<5000; i++) {
            Random random = new Random();
            int tempNumber = random.nextInt(DATA_BOUNDARY);
            putCurrentNumber(tempNumber);
        }
        printStatistics();
    }

    public void putCurrentNumber(int tempNumber) {
        if (hashtable.containsKey(tempNumber)) {
            hashtable.put(tempNumber, hashtable.get(tempNumber) + 1);
        } else {
            hashtable.put(tempNumber, 1);
        }
    }

    public void printStatistics() {
        Set<Integer> keys = hashtable.keySet();
        for (Integer key: keys) {
            if (key % 10 -1 == 0) System.out.println();
            System.out.print(key + "=" + hashtable.get(key) + " ");
        }
    }
}