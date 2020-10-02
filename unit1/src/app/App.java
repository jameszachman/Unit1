package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        String answer1;
        String correctAnswer1 = "Yes" ;
        String answer2;
        String correctAnswer2 = "No" ;
        String answer3;
        String correctAnswer3 = "16" ;
        String answer4;
        String correctAnswer4 = "Water";
        String answer5;
        String correctAnswer5 = "Orange";
        int i = 0;
        int p = 0;

        System.out.println("Capitalize your first letter to your answer.");

        //First Question
        System.out.println("Is the earth round?");
        answer1 = input.nextLine();
        if(answer1.equals(correctAnswer1)){
             System.out.println("You are correct.");
             i = i + 1; 
             p = p + 20;
        }
        else{
            System.out.println("You are incorrect.");
            i = i + 0;
            p = p + 0;
        }

        //Second Question
        System.out.println("Is the sky red?");
        answer2 = input.nextLine();
        if(answer2.equals(correctAnswer2)){
             System.out.println("You are correct.");
             i = i + 1;
             p = p + 20;
        }
        else{
            System.out.println("You are incorrect.");
            i = i + 0;
            p = p + 0;
        }

        //Third Question
        System.out.println("What is 4 squared? (PLEASE USE DIGITS FOR YOUR ANSWER)");
        answer3 = input.nextLine();
        if(answer3.equals(correctAnswer3)){
             System.out.println("You are correct.");
             i = i + 1;
             p = p + 20;
        }
        else{
            System.out.println("You are incorrect.");
            i = i + 0;
            p = p + 0;
        }

        //Fourth Question
        System.out.println("What is the ocean made out of?");
        answer4 = input.nextLine();
        if(answer4.equals(correctAnswer4)){
             System.out.println("You are correct.");
             i = i + 1;
             p = p + 20;
        }
        else{
            System.out.println("You are incorrect.");
            i = i + 0;
            p = p + 0;
        }

        //Fifth Question
        System.out.println("What color is a carrot?");
        answer5 = input.nextLine();
        if(answer5.equals(correctAnswer5)){
             System.out.println("You are correct.");
             i = i + 1;
             p = p + 20;
        }
        else{
            System.out.println("You are incorrect.");
            i = i + 0;
            p = p + 0;
        }

        System.out.println("Your score is " + i + " out of 5" );
        System.out.println("You got " + p + "%.");
           
        }
}