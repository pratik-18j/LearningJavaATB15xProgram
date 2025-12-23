package ex_02_Java_Basics;

public class Lab024_printF {
    public static void main(String[] args) {
//        System.out.println("It will add new line");
//        System.out.print("Will not add new line");

        System.out.printf("This is a normal print");//No new lin
        System.out.printf("This is a normal print");

        int a =10;
        System.out.println("The value of a is: " +a);
        System.out.printf("The value of a is %d", a);

//        d% = int, byte, short, long
//        s% = string
//        f% = float, double
//        b% = boolean

        int aa = 10;
        int bb = 12;
        System.out.printf("When you mul aa*bb, the result is = %d * %d",aa,bb);
    }
}
