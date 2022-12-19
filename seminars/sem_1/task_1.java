// Реализовать метод, принимающий в качестве аргумента целочисленный массив,
// если длина массива меньше некоторого заданного минимума,   
// метод возвращает -1 в качестве кода ошибки. Иначе, длину массива. 

package seminars.sem_1;

public class task_1 {
    private static int limit = 1;
    public static void main(String[] args) {
        System.out.println(arrayLength(new int[] {1, 6, 3, 8, 23}, 9));
        System.out.println(al(new int[] {1, 6, 3, 8, 23})); 
    }   

    private static int arrayLength(int[] arr, int limit) {
        return arr.length < limit ? -1 : arr.length;
    }

    private static int al(int[] arr) {
        return arrayLength(arr, limit);
    }
}
