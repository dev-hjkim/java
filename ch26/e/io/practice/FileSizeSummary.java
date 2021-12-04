package e.io.practice;

import java.io.File;
import java.text.DecimalFormat;

public class FileSizeSummary {
    public static void main(String[] args) {
        FileSizeSummary sample = new FileSizeSummary();
        String path = "D:\\java";
        long sum = sample.printFileSize(path);
        System.out.println(path + "'s total size=" + sample.convertFileLength(sum));
    }

    public long printFileSize(String dirName) {
        File dir = new File(dirName);
        long sum = 0;

        if (dir.isDirectory()) {
            File[] fileList = dir.listFiles();
            for (File file : fileList) {
                if (file.isFile()) {
                    String tempFileName = file.getAbsolutePath();
                    long fileLength = file.length();
                    //System.out.println(tempFileName + "=" + convertFileLength(fileLength));
                    sum += fileLength;
                } else {
                    String tempDirName = file.getAbsolutePath();
                    long fileLength = printFileSize(tempDirName);
                    System.out.println("[" + tempDirName + "]=" + convertFileLength(fileLength));
                    sum += fileLength;
                }
            }
        }
        return sum;
    }

    private String convertFileLength(long fileLength) {
        String sizeFormat;
        DecimalFormat df = new DecimalFormat("0.##");
        if (fileLength <= 1024) {
            String fileSize = df.format(1.0 * fileLength);
            sizeFormat = fileSize + " b";
        } else if (1024 < fileLength && fileLength <= 1024*1024) {
            String fileSize = df.format(1.0 * fileLength / 1024);
            sizeFormat = fileSize + " kb";
        } else if (1024*1024 < fileLength && fileLength <= 1024*1024*1024) {
            String fileSize = df.format(1.0 * fileLength / (1024*1024));
            sizeFormat = fileSize + " mb";
        } else {
            String fileSize = df.format(1.0 * fileLength / (1024*1024*1024));
            sizeFormat = fileSize + " gb";
        }

        return sizeFormat;
    }
}