package ex_04_Operators;

public class Lab041_Logical_Operator {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(a);
        System.out.println(!a);

        boolean b = false;
        System.out.println(b);
        System.out.println(!b);
        System.out.println(!!b);

        boolean c = true || false;
        System.out.println(c);

        boolean c1 = false && true;
        System.out.println(c1);
    }
}
