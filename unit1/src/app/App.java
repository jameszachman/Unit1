package app; 

public class App {
    public static void main(String[] args) throws Exception {
        int count = 0;
        String color = "red";
        boolean truth = true;

        //Number Loop
        while (count <= 10) {
            System.out.println("The count is " + count);
            count = count + 1;
        }

        System.out.println("count finished");
        //Color Loops
        while (color == "red") {
            System.out.println("The color is " + color);
            color = "green";
        }

        System.out.println("Color finished");

        //Boolean Loop
        while (truth == true) {
            System.out.println("The statement is " + truth);
            truth = false;
        }

        System.out.println("Truth is false");
    }


    }

