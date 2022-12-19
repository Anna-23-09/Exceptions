package lections.lec_1;
import java.io.File;

public class task_1 {
    public static void main(String[] args) {
        // System.out.println(getFileSize(new File("README.md"))); вызов функции getFileSize
        // System.out.println(divide(10, 0)); вызов функции divide
    }

    public static int divide (int a1, int a2) {
        if (a2 == 0) {
            return -1;
        }
        return a1 / a2;
    }

    public static long getFileSize (File file) {
        if (!file.exists()) {
            return -1;
        }
        return file.length();
    } 
}
