package ex_19_OPPs_Par2.OPPs_01_Inheritance_SingleInheritance;

public class Lab168_SI {
    public static void main(String[] args) {
        Son Pratik = new Son();
        System.out.println(Pratik.gold_f);

        Pratik.bhk3();
        Pratik.bhk2();

        Father Anil = new Father();
        System.out.println(Anil.gold_f);

        Anil.bhk2();

    }
}
