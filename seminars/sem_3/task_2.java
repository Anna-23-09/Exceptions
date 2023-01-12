//Создайте метод doSomething(), который может быть источником 
//одного из типов checked exceptions (тело самого метода прописывать не обязательно). 
//Вызовите этот метод из main и обработайте в нем исключение, которое вызвал метод doSomething().

package seminars.sem_3;

import java.io.IOException;

public class task_2 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            System.exit(1);
        }
        System.out.println(123);
    }

    public static void doSomething() throws IOException {
        IOException e = new IOException("smth");
        throw e;
    }
}
