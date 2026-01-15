package ex_15_StringBuffer_StringBuilder_Functions;

public class Lab145_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Pratik");
        sb.append(" QA");
        System.out.println(sb);

        String s1 = "Pratik";
        s1 = s1 + " QA";
        System.out.println(s1);
        //Thought the result is the same but StringBuffer is efficiet since its creating only one stirng
    }
}
