package ex_05_TypeCasting;

public class Lab_057_Type_Casting_0 {
    public static void main(String[] args) {
        byte b = 10;
        int a1 = b;        //Valid syntax - ImplicitCasting - Widening - Done by JVM/Java
        int a2 = (int)b;   //Valid syntax - ExplicitCasting - Widening - Done by JVM/Java
        float f = b;

    }
}
