//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. 
//Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:

//1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//3. если вместо массива пришел null, метод вернет -3
//4. придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.

//Напишите метод, в котором реализуйте взаимодействие с пользователем. 
//То есть, этот метод запросит искомое число у пользователя, вызовет первый, 
//обработает возвращенное значение и покажет читаемый результат пользователю. 
//Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.

package seminars.sem_1;

public class task_2 {
    private static int limit = 1;
    public static void main(String[] args) {
        System.out.println(arraySearch(new int[] {1, 6, 3, 8, 23}, 9));
    }

    private static int arraySearch(int[] arr, int target) {
        // if(arr == null) return -3;
        if (arr.length < limit) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return arr[i];
        }
        return -2;
    }    
}
