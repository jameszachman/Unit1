package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter a number");
    input.nextLine();
    int firstNum = input.nextInt();

    System.out.println("Please enter another number");
    input.nextLine();
    int secondNum = input.nextInt();
    
    while(firstNum < secondNum){
    if(firstNum % 2 == 0){
        firstNum = firstNum + 2;
        System.out.println(firstNum);
       
    }

    else{
        if(firstNum % 2 != 0){
            firstNum = firstNum + 1;
            System.out.println(firstNum);

            firstNum = firstNum + 2;
            System.out.println(firstNum);
        }
        
    }
}
   
        input.close();
}
}
