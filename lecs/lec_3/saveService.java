package lecs.lec_3;

import java.io.FileWriter;
import java.io.IOException;

public class saveService {
    public static void main(String[] args) {
        
    }

    public void save() throws SavedException {
        System.out.println("Save documents started...");
        try(FileWriter writer = new FileWriter("test")) {
            throw new IOException("Operation failed");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new SavedException ();
        }
    }
}
