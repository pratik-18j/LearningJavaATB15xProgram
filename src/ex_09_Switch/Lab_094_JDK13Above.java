package ex_09_Switch;

public class Lab_094_JDK13Above {
    public static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode){
            case 001, 002,003:
                System.out.println("Electronics");
                break;
            case 004, 005,006:
                System.out.println("Mech");
                break;
            default:
                System.out.println("Unknown");
                break;
        }
    }
}
