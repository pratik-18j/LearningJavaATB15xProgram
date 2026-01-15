package ex_15_StringBuffer_StringBuilder_Functions;

public class Lab148_SB {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Pratik");
        sb.append(" QA");
        System.out.println(sb);

        sb.replace(6,9,"Data Engineer");
        System.out.println(sb);

    }
}
