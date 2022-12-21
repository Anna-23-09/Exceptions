//Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив. 
//Метод должен пройтись по каждому элементу и проверить что он не равен null. А теперь реализуйте следующую логику:

//1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

package seminars.sem_1;

import java.util.ArrayList;
import java.util.List;

public class task4 {
    public static void main(String[] args) {
        checkArray(new Float[] {1.0f, Float.NaN, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 2.0f, 3.3f, null, Float.NaN});
    }

    private static void checkArray(Float[] arr) {
        List<Integer> nulls = new ArrayList<>();
        List<Integer> nans = new ArrayList<>();
        List<Integer> infinities = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                nulls.add(i);
            } else if (arr[i].isNaN()) {
                nans.add(i);
            } else if (arr[i].isInfinite()) {
                infinities.add(i);
            }
        }
        StringBuilder mes = new StringBuilder();
        if (nulls.size() > 0) {
            mes.append("null в ячеках: ").append(nulls).append(" ");
        }
        if (nans.size() > 0) {
            mes.append("NaN в ячеках: ").append(nans).append(" ");
        }
        if (infinities.size() > 0) {
            mes.append("Infinity в ячеках: ").append(infinities).append(" ");
        }
        if (mes.length() > 0) {
            throw new RuntimeException(mes.toString());
        }
    }
}
