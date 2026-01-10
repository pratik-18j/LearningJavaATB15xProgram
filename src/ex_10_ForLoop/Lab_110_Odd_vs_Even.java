package ex_10_ForLoop;

public class Lab_110_Odd_vs_Even {
    public static void main(String[] args) {
        for(int i = 1; i <=50; i++){
            if(i%2 == 0){
                System.out.println("Even = >"+ i);
            }else{
                System.out.println("Odd => "+i);
            }
        }
    }
}
