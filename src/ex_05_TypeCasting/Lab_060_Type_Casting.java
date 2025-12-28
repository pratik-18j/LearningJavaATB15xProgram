package ex_05_TypeCasting;

public class Lab_060_Type_Casting {
    public static void main(String[] args) {
        long phone = 987654321l;
        //short s = phone;  //Narrow implicit - NOt allowed
        short s1 = (short) phone;
    }
}
