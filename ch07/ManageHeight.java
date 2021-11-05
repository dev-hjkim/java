public class ManageHeight {
    int [][] gradeHeights;

    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();

//        for(int i=0; i<5; i++) {
//            int classNum = i+1;
//            System.out.println("Class No.:" + classNum);
//            manageHeight.printHeight(i);
//        }

        int classNum = 0;
        while (classNum < 5) {
            classNum++;
            System.out.println("Class No.:" + classNum);
            manageHeight.printAverage(classNum-1);
        }

    }

    public void setData() {
        gradeHeights = new int[5][];

        gradeHeights[0] = new int[]{170, 180, 173, 175, 177};
        gradeHeights[1] = new int[]{160, 165, 167, 186};
        gradeHeights[2] = new int[]{158, 177, 187, 176};
        gradeHeights[3] = new int[]{173, 182, 181};
        gradeHeights[4] = new int[]{170, 180, 165, 177, 172};
    }

    public void printHeight(int classNo) {
        for(int height : gradeHeights[classNo]) {
            System.out.println(height);
        }
    }

    public void printAverage(int classNo) {
        double sum = 0;
        for(int height : gradeHeights[classNo]) {
            sum += height;
        }

        System.out.println("Height Average:" + sum/gradeHeights[classNo].length);
    }

}