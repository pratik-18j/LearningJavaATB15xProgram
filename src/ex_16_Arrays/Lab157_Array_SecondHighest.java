package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Array_SecondHighest {
    public static void main(String[] args) {

      int[] numbers = {12,34,53,23,78,23,48};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);

    }
}
