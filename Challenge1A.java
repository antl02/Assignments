import java.io.PrintStream;
import java.util.Scanner;

public class Challenge1A {

static int day1CalConsumed,
    day1CalBurned,
    day2CalConsumed,
    day2CalBurned,
    day3CalConsumed,
    day3CalBurned,
    day4CalConsumed,
    day4CalBurned,
    day5CalConsumed,
    day5CalBurned,
    day6CalConsumed,
    day6CalBurned,
    day7CalConsumed,
    day7CalBurned;

    static int totalCaloriesConsumed, totalCaloriesBurned;

    static double averageCaloriesConsumed,
    averageCaloriesBurned,
    netWeeklyPounds;

    public static void main(String args[]) {
        getUserInput();
        calculateCalories();
        displayCalories();


    }

    public static void getUserInput() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many calories were consumed on day 1?");
        day1CalConsumed = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("How many calories were burned on day 1?");
        day1CalBurned = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("How many calories were consumed on day 2?");
        day2CalConsumed = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("How many calories were burned on day 2?");
        day2CalBurned = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("How many calories were consumed on day 3?");
        day3CalConsumed = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("How many calories were burned on day 3?");
        day3CalBurned = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("How many calories were consumed on day 4?");
        day4CalConsumed = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("How many calories were burned on day 4?");
        day4CalBurned = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("How many calories were consumed on day 5?");
        day5CalConsumed = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("How many calories were burned on day 5?");
        day5CalBurned = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("How many calories were consumed on day 6?");
        day6CalConsumed = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("How many calories were burned on day 6?");
        day6CalBurned = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("How many calories were consumed on day 7?");
        day7CalConsumed = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("How many calories were burned on day 7?");
        day7CalBurned = keyboard.nextInt();
        keyboard.nextLine();

    }

    public static void calculateCalories()
    {
        totalCaloriesConsumed = day1CalConsumed + day2CalConsumed + day3CalConsumed + day4CalConsumed + day5CalConsumed + day6CalConsumed + day7CalConsumed;

        totalCaloriesBurned = day1CalBurned + day2CalBurned + day3CalBurned + day4CalBurned + day5CalBurned + day6CalBurned +day7CalBurned;

        averageCaloriesConsumed = totalCaloriesConsumed / 7;

        averageCaloriesBurned = totalCaloriesBurned / 7;

        netWeeklyPounds = (averageCaloriesConsumed - totalCaloriesBurned) / 3000;


    }

    public static void displayCalories()
    {

        System.out.printf("You consumed a total of " + ("%,d") + " calories this week.\n", totalCaloriesConsumed);
        System.out.printf("You burned a total of " + ("%,d") + " calories this week.\n\n", totalCaloriesBurned);

        System.out.printf("You consumed an average of " + ("%,.2f") + " calories a day.\n", averageCaloriesConsumed);
        System.out.printf("You burned an average of " + ("%,.2f") + " calories a day.\n\n", averageCaloriesBurned);

        System.out.printf("Your net weekly gain/loss were " + ("%,.2f") + " pounds.", netWeeklyPounds);

    }
}