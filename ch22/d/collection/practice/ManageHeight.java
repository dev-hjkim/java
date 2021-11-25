package d.collection.practice;

import java.util.ArrayList;

public class ManageHeight {
    ArrayList<ArrayList<Integer>> gradeHeights;

    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();

        for (int i=1; i<6; i++) {
            System.out.println("Class No.:" + i);
            manageHeight.printHeight(i);
        }

        int classNo = 1;
        while (classNo < 6) {
            System.out.println("Class No.:" + classNo);
            System.out.print("Height average:");
            manageHeight.printAverage(classNo);
            classNo++;
        }
    }

    public void setData() {
        int[] c1 = new int[]{170, 180, 173, 175, 177};
        int[] c2 = new int[]{160, 165, 167, 186};
        int[] c3 = new int[]{158, 177, 187, 176};
        int[] c4 = new int[]{173, 182, 181};
        int[] c5 = new int[]{170, 180, 165, 177, 172};

        ArrayList<Integer> heights1 = new ArrayList<Integer>();
        ArrayList<Integer> heights2 = new ArrayList<Integer>();
        ArrayList<Integer> heights3 = new ArrayList<Integer>();
        ArrayList<Integer> heights4 = new ArrayList<Integer>();
        ArrayList<Integer> heights5 = new ArrayList<Integer>();

        for(Integer elem: c1) {
            heights1.add(elem);
        }
        for(Integer elem: c2) {
            heights2.add(elem);
        }
        for(Integer elem: c3) {
            heights3.add(elem);
        }
        for(Integer elem: c4) {
            heights4.add(elem);
        }
        for(Integer elem: c5) {
            heights5.add(elem);
        }

        gradeHeights = new ArrayList<ArrayList<Integer>>();
        gradeHeights.add(heights1);
        gradeHeights.add(heights2);
        gradeHeights.add(heights3);
        gradeHeights.add(heights4);
        gradeHeights.add(heights5);
    }

    public void printHeight(int classNo) {
        for(Integer height: gradeHeights.get(classNo-1)) {
            System.out.println(height);
        }
    }

    public void printAverage(int classNo) {
        double average = 0.0;
        for(Integer height: gradeHeights.get(classNo-1)) {
            average += height;
        }
        average /= gradeHeights.get(classNo-1).size();

        System.out.println(average);
    }
}