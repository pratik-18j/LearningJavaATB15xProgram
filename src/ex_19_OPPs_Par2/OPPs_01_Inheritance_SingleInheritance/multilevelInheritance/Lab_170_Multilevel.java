package ex_19_OPPs_Par2.OPPs_01_Inheritance_SingleInheritance.multilevelInheritance;

public class Lab_170_Multilevel {
    public static void main(String[] args) {
        Son pratik = new Son();
        pratik.home();
        pratik.gf();
        pratik.extraMoney();
        pratik.bhk3();

        Father f = new Father();
        f.home();
        f.gf();
        f.extraMoney();
        //f.bhk3();

        grandFather gf = new grandFather();
        gf.gf();
        gf.home();


        //Dynamic Dispatch
        grandFather g1 = new Son();
        Father f1 = new Son();
       // Son s1 = new grandFather();
       // Son S2 = new Father();
    }
}
