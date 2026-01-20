package task;

public class Jan16_2nd_Highest_Array {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};//100,34
        int highest = numbers[0];
        int secHighest = numbers[0];;

        for(int num : numbers){
            if (num > highest){
                secHighest = highest;
                highest = num;
            } else if (num > secHighest && num != highest) {
                secHighest = num;
            }
        }
        System.out.println("The second highest element from the array is: "+ secHighest);
    }
}
