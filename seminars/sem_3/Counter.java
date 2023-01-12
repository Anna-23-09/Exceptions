//Создайте класс Счетчик, у которого есть метод add(), 
//увеличивающий значение внутренней int переменной на 1. 
//Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. 
//Подумайте, что должно происходить при закрытии этого ресурса? 
//Напишите метод для проверки, закрыт ли ресурс. 
//При попытке вызвать add() у закрытого ресурса, должен выброситься IOException

package seminars.sem_3;

import java.io.IOException;

public class Counter implements AutoCloseable {
    
    private Integer count;

    private boolean closed = false;

    public Counter() {
        count = 0;
    }

    public void add() throws IOException {
        if (closed) {
            throw new IOException();
        }
        count++;
    }

    public String toString() {
        return String.valueOf(count);
    }

    public void close() throws Exception {
        count = null;
    }
 }
