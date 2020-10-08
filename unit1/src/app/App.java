package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
        int i = 0;
    String password = input.next();

    System.out.println("Please enter password.");

    //Questions
        if(password == "lordoftherings"){
            System.out.println("You have found the password.");
        }
    //Wrong Answer
        if(password != "lordoftherings"){
            System.out.println("Wrong password.  Try again.");
            i = i + 1;
        }
    //Lock Out
        if(i == 3){
            System.out.println("Too many attempts.  Relaunch program to try again.");
            System.exit(1);
        }
        input.close();
    }
}