package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
        
    System.out.println("Please enter password.");
    int i = 0;
    String pattern = input.nextLine();

    //Questions
    while(i != 3){
        if(pattern.equals("lordoftherings") ){
            System.out.println("You have found the password.");
            System.exit(1);
        }
        else{
        System.out.println("Wrong password.  Try again.");
        i = i + 1;  
        }
        
        System.out.println("Please enter password.");   
        String pattern2 = input.nextLine(); 

        if(pattern2.equals("lordoftherings") ){
            System.out.println("You have found the password.");
            System.exit(1);
        }
        else{
        System.out.println("Wrong password.  Try again.");
        i = i + 1;
        }

        System.out.println("Please enter password.");
        String pattern3 = input.nextLine(); 

        if(pattern3.equals("lordoftherings") ){
            System.out.println("You have found the password.");
            System.exit(1);
        }
        else{
        System.out.println("Wrong password.  Try again.");
        i = i + 1;

        System.out.println("Please enter password.");      
        }
        
    }
    if(i == 3){
            System.out.println("Too many attempts.  Relaunch program to try again.");
            System.exit(1);
        }
        input.close();
}
}
