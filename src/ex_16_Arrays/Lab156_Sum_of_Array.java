package ex_16_Arrays;

public class Lab156_Sum_of_Array {
    public static void main(String[] args) {
        int[] numbers = {12,34,40};
        int sum = 0;
        for(int i =0; i<numbers.length;i++){
            sum = sum + numbers[i];
        }
        System.out.println("Sum of array = " + sum);
    }
}
