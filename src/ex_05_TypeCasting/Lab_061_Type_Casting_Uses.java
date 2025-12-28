package ex_05_TypeCasting;

public class Lab_061_Type_Casting_Uses {
    public static void main(String[] args) {
        int course = 100;
        float NRST_GST = 18.45f;
        //int total = course +NRST_GST;  //Implicit Narrowing - Not allowed
        int total = course + (int)NRST_GST;  //Explicit Narrowing and we will lose .45
        System.out.println(total);

        float total2 = course + NRST_GST;
        System.out.println(total2);    // Explicit widening
    }
}
