// Запишите в файл следующие строки:

// Анна=4

// Елена=5

// Марина=6

// Владимир=?

// Константин=?

// Иван=4

//Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap, если студенты с ним знакомы). 
//В отдельном методе нужно будет пройти по структуре данных, если сохранено значение ?, заменить его на соответствующее число.
//Если на каком-то месте встречается символ, отличный от числа или ?, бросить подходящее исключение.
//Записать в тот же файл данные с замененными символами ?.

package seminars.sem_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class task_3 {
    public static void main(String[] args) throws IOException {
        reading();
    }

    public static void reading() throws IOException {

        Map<String, Integer> map = new HashMap<>();
        BufferedReader txt = null;
        try {
           txt = new BufferedReader(new FileReader("\task_3.txt")); 
           String line;
           while ((line = txt.readLine()) != null) {
                // System.out.println(line);
                String name = line.split("=")[0];
                Integer length = 0;
                try {
                    length = Integer.parseInt(line.split("=")[1]);
                } catch (NumberFormatException e) {
                    length = name.length();
                }
                
                
                map.put(name, length);
           }              
        } catch (IOException e) {
            System.out.println("File not founded");
        }
        finally {
            try {
                txt.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(map);
        }
    }

    public static void writing() {
        
    }
}

