package ex_15_StringBuffer_StringBuilder_Functions;

public class Lab144_StringBuilder_Vs_StringBuffer {
    public static void main(String[] args) {
        String s0 = "Pratik";
        String s1 = new String("Pratik");

        StringBuilder sb = new StringBuilder("Pratik");
        StringBuffer sf = new StringBuffer("Pratik");

        System.out.println(sb.reverse());
        System.out.println(sf.reverse());
    }
}
