package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter a number");
    int firstNum = input.nextInt();
    input.nextLine();

    System.out.println("Please enter a larger number");
    int secondNum = input.nextInt();
    input.nextLine();
    
    for (int i = firstNum; i < secondNum; i++){

        if (i % 2 == 0){
            System.out.println(i);
        }
    }
   
}
}
