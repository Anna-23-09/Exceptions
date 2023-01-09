package lecs.lec_3;

import java.io.IOException;

public class SavedException extends IOException {
    public static void main(String[] args) {
        
    }

    public SavedException(String message, Exception e) {
        super(message, e);
    }
}
