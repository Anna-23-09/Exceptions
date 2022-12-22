//Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

package homeworks.hw_1;

public class task2 {
    public static void main(String[] args) {
        System.out.println(sum2d(new String[][] {{"a", "b"}, {"b" , "a"}}));
        System.out.println(wrong_length(new String[][] {{"a", "b"}, {"b", "a"}}));
    }

    public static int sum2d (String [][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    private static void wrong_length (String [][] arr) {
        if (arr.length != arr[0].length) {
            throw new RuntimeException("Массив неквадратный");
        }
    }
}
