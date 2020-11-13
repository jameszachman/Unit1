package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);

    int i = 100;

    //String inside = "inside";
    //String outside = "outside";
    //String column = "column";
    //String dozen = "dozen";
    System.out.println("Would you like to make an inside or outside bet?");
    String response = input.nextLine();

    if(response == "inside"){
        System.out.println("Which type of bet would you like? (straight-up, split, street, corner, five or line)");

        //Straight-Up Bets
        if(response == "straight-up"){
            System.out.println("What is the number you want to bet on?");
        }

        //Split Bets
        if(response == "split"){
            System.out.println("What are the numbers you want to split? (Choose two numbers that are adjacent to each other. (Ex: 15-16, 20-21))");
        }

        //Street Bets
        if(response == "street"){
            System.out.println("What are the three numbers you want to bet on? (Choose three numbers that are in line with each other. (Ex: 7-8-9, 13-14-15))");
        }

        //Corner Bets
        if(response == "corner"){
            System.out.println("What are the four numbers you want to bet on?  (Choose four numbers that form a square together.  (Ex: 1-2-4-5, 16-17-19-20))");
        }

        //Five Bets
        if(response == "five"){
            System.out.println("You have chosen to bet on 0, 00, 1, 2 and 3.  Now spinning...");
        }

        //Line Bets
        if(response == "line"){
            System.out.println("What are the six numbers you want to bet on?  (Choose six number that form a rectangle on the board starting from the left edge of the board and ending on the right edge.  (Ex: 22-27, 10-15))");
        }
    }

    //Outside Bets
    if(response == "outside"){
        System.out.println("Which type of bet would you like? (column, dozen, color, odd or even, low or high)");

        //Column Bets
        if(response == "column"){
            System.out.println("Which column would you like? 1st, 2nd or 3rd?");

            if(response == "1st"){
            System.out.println("You've chosen the 1st column.  Now spinning...");
            }

            if(response == "2nd"){
            System.out.println("You've chosen the 2nd column.  Now spinning...");
            }

            if(response == "3rd"){
            System.out.println("You've chosen the 3rd column.  Now spinning...");
            }
        }
        
        //Dozen Bets
        if(response == "dozen"){
            System.out.println("Which dozen would you like? 1st 12, 2nd 12 or 3rd 12?");

            if(response == "1st 12"){
                System.out.println("You've chosen the 1st 12.  Now spinning...");
            }

            if(response == "2nd 12"){
                System.out.println("You've chosen the 2nd 12.  Now spinning...");
            }

            if(response == "3rd 12"){
                System.out.println("You've chosen the 3rd 12.  Now spinning...");
            }

        //Bet on Color
        if(response == "color"){
            System.out.println("Which color would you like to bet on? Black or red?");

            if(response == "black"){
                System.out.println("You've chosen black.  Now spinning...");
            }

            if(response == "red"){
                System.out.println("You've chosen red.  Now spinning...");
            }
        }

        //Bet on Odd
        if(response == "odd"){
            System.out.println("You've chosen to bet on all odd numbers.  Now spinning...");
        }

        //Bet on Even
        if(response == "even"){
            System.out.println("You've chosen to bet on all even numbers.  Now spinning...");
        }

        //Bet on Low
        if(response == "low"){
            System.out.println("You've chosen to bet on the low numbers.  Now spinning...");
        }

        //Bet on High
        if(response == "high"){
            System.out.println("You've chosen to bet on the high numbers.  Now spinning...");
        }

        }

    }

}
}
