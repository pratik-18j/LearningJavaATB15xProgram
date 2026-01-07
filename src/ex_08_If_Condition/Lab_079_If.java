package ex_08_If_Condition;

public class Lab_079_If {
    public static void main(String[] args) {
        System.out.println("Enter the age via CLI options");
        int age = Integer.parseInt(args[0]);

        if(age >18) {
            System.out.println("You can vote");
        }
        else{
            System.out.println("You can't");
        }
    }
}
