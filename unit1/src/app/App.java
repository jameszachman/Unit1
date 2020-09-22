package app;

public class App {
    public static void main(String[] args) throws Exception {
        String person1 = "Michael";
        String verb1 = "code";
        String dayOfWeek = "Tuesday";
        String food = "bagel";
        String adjective1 = "delicious";
        String verb2 = "eat";
        String person2 = "John";
        String place1 = "Casey's";
        String adjective2 = "new";
        String place2 = "YMCA";
        String verb3 = "shoot hoops";

        //[person1] is a programmer who likes to [verb1].
        System.out.println(person1 + " is a programmer who likes to " + verb1 + ".");
        //Every [dayOfWeek] they make a [adjective1]  [food] for breakfast and [verb2] at [place1] with [person2].
        System.out.println("Every " + dayOfWeek + " they make a " + adjective1 + " " + food + " for breakfast and " + verb2 + " at " + place1 + " " + "with" + " " + person2 + ".");
        //Sometimes, they go to the [adjective2]  [place2] with [person2] so that they can [verb3] together.
        System.out.println("Sometimes" + " they go to the " + adjective2  + " " + place2 + " with " + person2 + " so that they can " + verb3 + " together.");

    }
}