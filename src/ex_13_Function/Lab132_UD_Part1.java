package ex_13_Function;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {
        //User defined functions

        //1. Without parameters and without return.
        //2. Without parameters and with return.
        //3. With parameters and without return.
        //4. With parameters and with return.


        //1. Without parameters and without return.
            wop_wor_great();

        //2. Without parameters and with return.
          String msg =   wop_wr_string();

        //3. With parameters and without return.
          wp_wor("Praik", 33,100);

        //4. With parameters and with return.
          int sum = wp_wr(2,5);
    }

    static int wp_wr(int i, int i1) {
        return i + i1;
    }

    static void wp_wor(String pratik, int i, int i1) {
    }

    static String wop_wr_string() {
        return "pratik";
    }

    static void wop_wor_great() {
    }
}
