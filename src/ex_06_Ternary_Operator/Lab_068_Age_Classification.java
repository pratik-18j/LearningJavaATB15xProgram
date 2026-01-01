package ex_06_Ternary_Operator;

public class Lab_068_Age_Classification {

    public static void main(String[] args) {
        //User will give input from command line
        String age_input_string = args[0];
        System.out.println(age_input_string instanceof String);
        int age_user_input = Integer.parseInt(age_input_string);
        System.out.println(age_user_input);

        String result = (age_user_input <= 18)? "Minor": (age_user_input <= 65)?  "Adult" : "Senior Citizen";
        System.out.println(result);
    }
}
