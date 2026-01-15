package ex_14_String;

public class LabStringExamples3 {
    public static void main(String[] args) {

        String s1 = "Java".substring(2);
        System.out.println(s1);

//        "unhappy".substring(2) returns "happy"
//        "Harbison".substring(3) returns "bison"
//        "emptiness".substring(9) returns "" (an empty string)

        char arr[] = "Java".toCharArray();
        System.out.println(arr);

        boolean b = " ".isBlank();
        System.out.println(b);

        boolean b1 = "".isEmpty();
        System.out.println(b1);

        String s2 = "ab".repeat(3);
        System.out.println(s2);

        boolean b2 = "Java".equalsIgnoreCase("java");
        System.out.println(b2);

        long count = "a\nb\nc".lines().count();
        System.out.println(count);
    }
}
