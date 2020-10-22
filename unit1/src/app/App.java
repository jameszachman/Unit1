package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);

    System.out.println("What is the temperature outside?");

    int fNum = 32;
    int iNum = input.nextInt();
    boolean on = true;
    
    
    
    while (on == true){
        if (iNum < fNum){
            System.out.println("It is below freezing outside.");
            on = false;
        }
        if (iNum > fNum){
            System.out.println("It is above freezing outside.");
            on = false;
        }
        if (iNum == fNum){
            System.out.println("It is 32 degrees outside.");
            on = false;
        }
    }
        input.close();

    
}
}
