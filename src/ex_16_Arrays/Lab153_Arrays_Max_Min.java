package ex_16_Arrays;

import java.util.Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {

        int[] array = {25,14,56,15,36,56,77,18,28,49};

        //Type:1
        Arrays.sort(array);
        System.out.println(array[array.length-1]);

        //Type:2
        int max = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);


        int min = array[0];
        for(int j = 0; j < array.length; j++){
            if(array[j] < min){
                min = array[j];
            }
        }
        System.out.println(min);

    }
}
