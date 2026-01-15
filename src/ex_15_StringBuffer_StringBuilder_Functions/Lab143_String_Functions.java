package ex_15_StringBuffer_StringBuilder_Functions;

public class Lab143_String_Functions {
    public static void main(String[] args) {

        String name = "Pratik";
        System.out.println(name.length());
        System.out.println(name.charAt(2));

        //2. Concat()
        System.out.println(name.concat(" QA"));

        //3. contains()
        System.out.println(name.contains("t"));

        //4.equals()
        System.out.println(name.equals("Pratik"));

        //5.equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("praTIK"));

        //6. indexOf()
        System.out.println(name.indexOf("k"));

        //7. replace()
        System.out.println(name.replace("i","ee"));

        //8. substring()
        System.out.println(name.substring(1,3));

        //9 tolowercase
        System.out.println("PRATIK".toLowerCase());

        //10 touppercase
        System.out.println("pratik".toLowerCase());

        //11 startswith
        System.out.println(name.startsWith("P"));

        //12 endswith
        System.out.println(name.endsWith("k"));

        //13 trim()
        String name2 = "        Pratik";
        System.out.println(name2.trim());

        //14. compareTo()
        System.out.println(name.compareTo("Pratik"));

        //------------------------------------------------------//

        StringBuilder stringbuilder  = new StringBuilder("Pratik");
        System.out.println(stringbuilder);

        stringbuilder.reverse();
        System.out.println(stringbuilder);

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());

    }
}
