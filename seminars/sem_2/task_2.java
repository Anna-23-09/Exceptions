package seminars.sem_2;

public class task_2 {
    public static void main(String[] args) {
        System.out.println(sum2d(new String[][] {{"an", "al"}, {"p", "f"}} ));
    }
    
    public static int sum2d (String[][] arr) {
        if (arr.length < 5) {
            System.out.println("Мало элементов :(");
            String[][] ar = new String[arr.length][5];
            for (int i = 0; i < ar.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    ar[i][j] = arr[i][j];
                }
            }

            for (int i = 0; i < ar.length; i++) {
                for (int j = arr[0].length; j < 5; j++) {
                    ar[i][j] = "0";
                }
            }
            arr = ar;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                try {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
                } catch (NumberFormatException e) {
                    System.out.println("Error");
                    arr[i][j] = "0";
                }
            }
        }
          return sum;  
    }
}
