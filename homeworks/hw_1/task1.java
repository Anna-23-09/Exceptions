//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

package homeworks.hw_1;

import java.util.Scanner;

import javax.lang.model.type.NullType;
import javax.lang.model.util.SimpleAnnotationValueVisitor9;

public class task1 {
    public static void main(String[] args) {
        System.out.println(dividing(5, 0));
        System.out.println(resulting(new int[] {1, 7, 9, 2}, 3));
        System.out.println(checking_arr(new int[] {1, 0, 0, 0, 2}));
        
    }

    private static int dividing (int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Cannot be divided by 0");
        } else return a / b;
    }

    private static int resulting (int[] arr, int limit) {
        limit = arr.length;
        if (arr.length > limit - 1) {
            throw new RuntimeException("Incorrect limit");
        } 
        else System.out.println(arr);
    }

    private static void checking_arr (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                throw new RuntimeException("The array should only contain 0");
            } 
            else System.out.println(arr);
        }
    }
}
