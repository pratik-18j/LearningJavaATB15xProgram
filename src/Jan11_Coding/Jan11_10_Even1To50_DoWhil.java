package Jan11_Coding;

public class Jan11_10_Even1To50_DoWhil {
    public static void main(String[] args) {
        int i =1;
        do{
            if(i%2 == 0){
                System.out.println(i);
            }
            i++;
        }
        while(i<=50);
        System.out.println("End of program!");
    }

}
