package ex_14_String;

public class LabStringExamples1 {
    public static void main(String[] args) {
        String s  = "Java";

        System.out.println(s.charAt(0));
        System.out.println(s.length());

        int result = "abc".compareTo("ABC");
        System.out.println(result);

        int idx = "Java".indexOf("a");
        System.out.println(idx);

        int idx2 = "Java".lastIndexOf("a");
        System.out.println(idx2 );

        boolean b = "".isEmpty();
        System.out.println(b);

        String s1 = String.join("&","Java","Python");
        System.out.println(s1);

        String s2 = "Java".replace("a","O");
        System.out.println(s2);

        boolean b1 = "Java".startsWith("Ja");
        System.out.println(b1);

        boolean b2 = "Java".startsWith("ja");
        System.out.println(b2);

        String s3 = "Java".concat("Mava");
        System.out.println(s3);
    }
}
