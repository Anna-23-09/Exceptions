//Разработайте программу, которая выбросит Exception, 
//когда пользователь вводит пустую строку. 
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package homeworks.hw_2;

import java.io.IOException;
import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        printing();
    }

    public static void printing() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку: ");
            String s = scanner.nextLine(); 
            if (s == " ") 
               try {
                scanner.nextLine();
               }
                catch (IOException e) {
                System.out.println("Error" + e + "Строка не может быть пустой");
                }
        }        
    }
}
