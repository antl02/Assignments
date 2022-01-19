import java.util.Scanner;
public class MadLibs {
    public static void main(String args[])
    {

        int favNumber;
        String favColor;
        String favFood;
        String favLocation;

        System.out.println("Welcome to Madlibs!");
        System.out.println("I am going to ask you 4 question");
        System.out.println("What is your favorite number?");
        Scanner keyboard = new Scanner(System.in);
        favNumber = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("What is your favorite color?");
        favColor = keyboard.nextLine();
        System.out.println("What is your favorite food?");
        favFood = keyboard.nextLine();
        System.out.println("What is your favorite place to visit?");
        favLocation = keyboard.nextLine();

        System.out.println("Once upon a time, there existed a princess who loved to eat " + favFood + ". ");
        System.out.println("Her prince charming took her to " + favLocation + " " + favNumber + " times. ");
        System.out.println("While there, they saw many beautiful " + favColor + " butterflies.");



    }
}
