package d.collection.practice;

import java.util.Random;
import java.util.HashSet;

public class RandomNumberMaker {
    public static void main(String[] args) {
        RandomNumberMaker randomNumberMaker = new RandomNumberMaker();
        int loop = 0;
        while(loop < 10) {
            HashSet<Integer> randSet = randomNumberMaker.getSixNumber();
            System.out.println(randSet);
            loop++;
        }
    }

    public HashSet<Integer> getSixNumber() {
        HashSet<Integer> resObj = new HashSet<Integer>();

        while (resObj.size() < 6) {
            Random random = new Random();
            int tempNumber = random.nextInt(45);
            resObj.add(tempNumber);
        }

        return resObj;
    }
}