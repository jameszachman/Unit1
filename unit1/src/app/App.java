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

    if(response.equals("inside")){
        System.out.println("Which type of bet would you like? (straight-up, split, street, corner, five or line)");
        input.nextLine();

        //Straight-Up Bets
        if(response.equals("straight-up")){
            System.out.println("What is the number you want to bet on?");
            input.nextInt();
        }

        //Split Bets
        if(response.equals("split")){
            System.out.println("What are the numbers you want to split? (Choose two numbers that are adjacent to each other. (Ex: 15-16, 20-21))");
            input.nextInt();
        }

        //Street Bets
        if(response.equals("street")){
            System.out.println("What are the three numbers you want to bet on? (Choose three numbers that are in line with each other. (Ex: 7-8-9, 13-14-15))");
            input.nextInt();
        }

        //Corner Bets
        if(response.equals("corner")){
            System.out.println("What are the four numbers you want to bet on?  (Choose four numbers that form a square together.  (Ex: 1-2-4-5, 16-17-19-20))");
            input.nextInt();
        }

        //Five Bets
        if(response.equals("five")){
            System.out.println("You have chosen to bet on 0, 00, 1, 2 and 3.  Now spinning...");
            input.nextInt();
        }

        //Line Bets
        if(response.equals("line")){
            System.out.println("What are the six numbers you want to bet on?  (Choose six number that form a rectangle on the board starting from the left edge of the board and ending on the right edge.  (Ex: 22-27, 10-15))");
            input.nextInt();
        }
    }

    //Outside Bets
    if(response.equals("outside")){
        System.out.println("Which type of bet would you like? (column, dozen, color, odd or even, low or high)");
        input.nextLine();

        //Column Bets
        if(response.equals("column")){
            System.out.println("Which column would you like? 1st, 2nd or 3rd?");
            input.nextLine();

            if(response.equals("1st")){
            System.out.println("You've chosen the 1st column.  Now spinning...");
            }

            if(response.equals("2nd")){
            System.out.println("You've chosen the 2nd column.  Now spinning...");
            }

            if(response.equals("3rd")){
            System.out.println("You've chosen the 3rd column.  Now spinning...");
            }
        }
        
        //Dozen Bets
        if(response.equals("dozen")){
            System.out.println("Which dozen would you like? 1st 12, 2nd 12 or 3rd 12?");
            input.nextLine();

            if(response.equals("1st 12")){
                System.out.println("You've chosen the 1st 12.  Now spinning...");
            }

            if(response.equals("2nd 12")){
                System.out.println("You've chosen the 2nd 12.  Now spinning...");
            }

            if(response.equals("3rd 12")){
                System.out.println("You've chosen the 3rd 12.  Now spinning...");
            }

        //Bet on Color
        if(response.equals("color")){
            System.out.println("Which color would you like to bet on? Black or red?");
            input.nextLine();

            if(response.equals("black")){
                System.out.println("You've chosen black.  Now spinning...");
            }

            if(response.equals("red")){
                System.out.println("You've chosen red.  Now spinning...");
            }
        }

        //Bet on Odd
        if(response.equals("odd")){
            System.out.println("You've chosen to bet on all odd numbers.  Now spinning...");
            input.nextLine();
        }

        //Bet on Even
        if(response.equals("even")){
            System.out.println("You've chosen to bet on all even numbers.  Now spinning...");
            input.nextLine();
        }
        

        //Bet on Low
        if(response.equals("low")){
            System.out.println("You've chosen to bet on the low numbers.  Now spinning...");
            input.nextLine();
        }

        //Bet on High
        if(response.equals("high")){
            System.out.println("You've chosen to bet on the high numbers.  Now spinning...");
            input.nextLine();
        }

        }

    }

}
}
