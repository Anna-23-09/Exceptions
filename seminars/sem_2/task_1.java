package seminars.sem_2;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] arr = new int[10];
            System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
            int index = 0;
            if (scanner.hasNextInt()) {
                index = scanner.nextInt();
            } else {
                System.out.println("Введено не число");
            } 
            arr[index] = 1;
            // try {
            //     arr[index] = 1;
            // } catch (Exception e) {
            //     System.out.println("Указан индекс за пределами массива");
            // }
        }
    }
}
