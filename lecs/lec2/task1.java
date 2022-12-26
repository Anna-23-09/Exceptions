package lecs.lec2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class task1 {
    public static void main(String[] args) throws IOException {
        //NullPointerException
        
        //String name  = null;
        //System.out.println(name.length()); 

        //ClassCastException
        
        // Object object = new String("123");
        // File file = (File) object;
        //System.out.println(file); 

        //NumberFormatException
        
        // String number = "123fq";
        // Integer.parseInt(number);
        // System.out.println(number); 

        //UnsupportedOperationException
        
        // List<Object> emptylist = Collections.emptyList();
        // emptylist.add(new Object()); //для emptylist метод add не работает


        //try-catch
        // int number = 1;

        // try {
        //     int number = 10 / 0;
        //     String test = null;
        //     System.out.println(test.length());
        // } catch (ArithmeticException e) {
        //     System.out.println("Operation divide by zero not supported");
        // } catch (NullPointerException e) {
        //     System.out.println("Null Pointer Exception");
        // }
        // System.out.println(number);
        
        
        FileReader test = null;
        try {
            test = new FileReader("test");
            test.read();
        } catch (RuntimeException | FileNotFoundException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally start");
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("exception while close");
                }
            }
            System.out.println("finally finished");
        }

    }
}
