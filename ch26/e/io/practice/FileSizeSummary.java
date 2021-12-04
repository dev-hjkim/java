package e.io.practice;

import java.io.File;

public class FileSizeSummary {
    public static void main(String[] args) {
        FileSizeSummary sample = new FileSizeSummary();
        String path = "D:\\java";
        long sum = sample.printFileSize(path);
        System.out.println(path + "'s total size=" + sum);
    }

    public long printFileSize(String dirName) {
        File file = new File(dirName);
        long dirSize = file.length();

        File[] files = file.listFiles();
        for (File fileItem : files) {
            dirSize += fileItem.length();
        }

        return dirSize;

    }
}