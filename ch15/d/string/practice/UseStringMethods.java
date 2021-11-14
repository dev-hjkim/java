package d.string.practice;

public class UseStringMethods {
    public static void main(String[] args) {
        UseStringMethods useStringMethods = new UseStringMethods();
        useStringMethods.printWords("The String class represents character strings.");
        useStringMethods.findString("The String class represents character strings.", "string");
        useStringMethods.findAnyCaseString("The String class represents character strings.", "string");
        useStringMethods.countChar("The String class represents character strings.", 's');
        useStringMethods.printContainWords("The String class represents character strings.", "ss");
    }

    public void printWords(String str) {
        String[] splitted = str.split(" ");
        for (String word : splitted) {
            System.out.println(word);
        }
    }

    public void findString(String str, String findStr) {
        System.out.println(findStr + " is appeared at " + str.indexOf(findStr));
    }

    public void findAnyCaseString(String str, String findStr) {
        String lower = str.toLowerCase();
        System.out.println(findStr + " is appeared at " + lower.indexOf(findStr));
    }

    public void countChar(String str, char c) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (char ch : chars) {
            if (ch == c) {
                count++;
            }
        }
        System.out.println("char '" + c + "' count is " + count);
    }

    public void printContainWords(String str, String findStr) {
        String[] words = str.split(" ");
//        String containWords = "";
        StringBuffer sb = new StringBuffer();
        for (String word : words) {
            if (word.contains(findStr)) {
//                containWords += word;
                sb.append(word);
            }
        }
        System.out.println(sb + " contains " + findStr);
    }
}