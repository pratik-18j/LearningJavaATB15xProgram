package ex_05_TypeCasting;

public class Lab_058_Type_Casting_1 {
    public static void main(String[] args) {

        int a = 300;
        //byte b = a;    //Implicit Narrowing
        byte b1 = (byte) a; //Explict Narrowing
        System.out.println(b1);
        //Why will get 44 as output
        //1.  It will convert 300 to binary
        //    100101100
        //2. And since we are converting this to byte, it will take only last 8 bits
        //    00101100
        //Which is 44

    }
}
