//Если необходимо, исправьте данный код.

package homeworks.hw_2;

public class task_2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = {1, 6, 2, 87, 33, 1, 6, 2, 87, 33};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index 8 out of bounds for this length");
        } 
        
        catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
