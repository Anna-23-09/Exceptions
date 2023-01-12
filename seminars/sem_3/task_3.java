package seminars.sem_3;

public class task_3 {
    public static void main(String[] args) throws Exception {
        try (Counter counter = new Counter()) {
            System.out.println(counter);
            counter.add();
            System.out.println(counter);            
        } 
        Counter counter = new Counter();
        counter.close();
    }
}
