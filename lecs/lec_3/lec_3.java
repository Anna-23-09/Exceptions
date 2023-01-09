package lecs.lec_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class lec_3 {
    public static void main(String[] args) throws IOException {    
        
        
        try (FileReader reader = new FileReader("test");
            FileWriter writer = new FileWriter("test")) {
                while (reader.ready()) {
                    writer.write(reader.read());
                }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } 
        System.out.println("Copy succesfull");
    }
}
