package ex_09_Switch;

import java.util.Scanner;

public class Lab_087_Real_World_Use_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting the Chrome");
                break;
            case "firefox":
                System.out.println("Starting the Firefox");
                break;
            case "edge":
                System.out.println("Starting the Edge");
                break;
            default:
                System.out.println("No idea!!");
        }
    }
}
