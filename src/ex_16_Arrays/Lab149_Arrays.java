package ex_16_Arrays;

public class Lab149_Arrays {
    public static void main(String[] args) {

        int a = 10;
        int marks[] = {12,54,64,78,90,56};
        int[] marks2 = {12,54,64,78,90,56};

        boolean[] is_married = {true,false,true,false};
        String[] names = {"pratik","sagar","Vicky","rahul"};
        //diifferent data types are not allowed => String[] name1 = {"pratik","sagar","Vicky","rahul",674};

        float[] values = new float[3];
        values[0] = 3.14f;
        values[1] = 4.23f;
        values[2] = 5.23f;
        //values[3] = 6.34f;

       for(String name : names){
           System.out.println(name);
       }




    }
}
