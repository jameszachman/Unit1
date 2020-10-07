package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Axolotl facts! Please select a number between 1-5.");
        //First Fact
        int answer1 = input.nextInt();
        if(answer1 == 1){
             System.out.println("Axolotls are a group of amphibians that thrive in the waterways of Xochimilco, Mexico.");
             
        }
        else{
            System.out.println("You haven't selected a number between 1-5.");
            
        }
        
        //Second Fact
        int answer2 = input.nextInt();
        if(answer2 == 2){
             System.out.println("They have a set of feathery branches on the sides of their head that work as their gills.");
             
        }
        else{
            System.out.println("You haven't selected a number between 1-5.");
            
        }

        //Third Fact
        int answer3 = input.nextInt();
        if(answer3 == 3){
             System.out.println("Axolotls are a critically endangered species that thrives in capitivity more than in the wild.");
             
        }
        else{
            System.out.println("You haven't selected a number between 1-5.");
            
        }

        //Fourth Fact
        int answer4 = input.nextInt();
        if(answer4 == 4){
             System.out.println("Axolotls have a mythological story about the Aztec god of all things grim, Xolotl, who was a dog-headed being that was fearful of being killed.  It is believed by some that he transformed into an axolotl to hide, but cannot transform back to his true form.");
             
        }
        else{
            System.out.println("You haven't selected a number between 1-5.");
            
        }

        //Fifth Fact
        int answer5 = input.nextInt();
        if(answer5 == 5){
             System.out.println("Axolotls have a regenerative ability that allows them to grow back any limb, their spines, their jaws, and even their brain.");
             
        }
        else{
            System.out.println("You haven't selected a number between 1-5.");
            
        }

       input.close();
           
        }
}