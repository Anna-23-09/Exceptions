//Реализуйте метод, который запрашивает у пользователя ввод 
//дробного числа (типа float), и возвращает введенное значение. 
//Ввод текста вместо числа не должно приводить к падению приложения, 
//вместо этого, необходимо повторно запросить у пользователя ввод данных.

package homeworks.hw_2;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        reading();
    }

    public static void reading() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        if (scanner.next() instanceof String) {
            throw new RuntimeException("Необходимо ввести ДРОБНОЕ значение");
        }
    }
}
