package app;
import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        //FirstName
        System.out.println("Please enter your first name.");
        String name = input.nextLine();
        
        //LastName
        System.out.println("Please enter your last name.");
        String lastName = input.nextLine();

        //Age
        System.out.println("Please enter your age.");
        String age = input.nextLine();

        //Grade
        System.out.println("Please enter your grade level.");
        String grade = input.nextLine();

        //Color

        System.out.println("Please enter your favorite color.");
        String color = input.nextLine();

        //FinalMessage
        System.out.println("Hello, " + name + " " + lastName + ".  You are " + age + " years old, and you are in " + grade + " grade.  Your favorite color is " + color + ".");
        

    }
}