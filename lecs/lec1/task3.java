package lecs.lec1;

public class task3 {
    public static void main(String[] args) {
        divide(10, 0);
    }

    public static int divide (int a1, int a2) {
        if (a2 == 0) {
            throw new RuntimeException ("Divide by zero not permited.");
        }
        return a1 / a2;
    }
}
