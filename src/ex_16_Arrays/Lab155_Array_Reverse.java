package ex_16_Arrays;

public class Lab155_Array_Reverse {
    public static void main(String[] args) {
        int[] array = {12,34,86,23,67};
        int[] rev_array = new int[array.length];

        for(int i = array.length-1, j =0; i >=0; i--, j++){
            rev_array[i] = array[j];
        }

        for(int rev_arr : rev_array){
            System.out.println(rev_arr);
        }
    }
}
