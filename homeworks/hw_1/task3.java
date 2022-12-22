//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
//и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
//Если длины массивов не равны, необходимо как-то оповестить пользователя.

package homeworks.hw_1;

import java.util.ArrayList;

public class task3 {
    public static void main(String[] args) {
        System.out.println(arr_diff(new int[] {1, 6, 3, 8, 23}, new int[] {1, 6, 3, 23}));
    }

    private static void arr_diff (int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массивы разной длины");
        } else {
            for (int i = 0; i < arr2.length; i++) {
                ArrayList<Integer> new_list = new ArrayList<>();
                new_list.add(arr1[i] - arr2[i]);
                System.out.println(new_list);
            }
        }
    }
}
