//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив. 
//Необходимо посчитать и вернуть сумму элементов этого массива. 
//При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами 
//(кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1. Если нарушается одно из условий, 
//метод должен бросить RuntimeException с сообщением об ошибке
package seminars.sem_1;

import java.util.spi.ResourceBundleProvider;

public class task3 {
    public static void main(String[] args) {
        int[][] arr =new int[][] {{0, 1}, {1, 1}, {1, 0}};
        int sum = arraySum(arr);
        if (sum == 1) {
            if (arr.length > arr[0].length) {

            }
        }
    }

    private static int arraySum(int [][] arr) {
        if (arr == null) {
            throw new RuntimeException("Массив не задан ");
        }
        if (arr.length != arr[0].length) {
            return -1;
            // throw new RuntimeException("Массив не квадратный");
        }
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 0 || arr[i][j] == 1) {
                    res += arr[i][j];
                } else {
                    throw new RuntimeException ("В ячейке [" + i + "][" + j + "] не 0 или 1");
                }
            }
        }
        return res;
    }
}
