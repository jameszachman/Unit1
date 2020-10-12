package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    int i = 36;
    boolean doneFinish = false;

    System.out.println("Pick a number between 0-100.");
    input.nextLine();

    while(doneFinish == false){

    if(input.nextInt() == i){
        System.out.println("You have found the number!");
        doneFinish = true;
       
    }
    else{
        if(input.nextInt() < i){
                System.out.println("Too low.");
                
            }
            else{
                if(input.nextInt() > i){
                        System.out.println("Too high");
            }
            }
        }
    }
        input.close();
}
}
