import java.util.Scanner;

public class Conversion
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);

        int totalPennies;

        System.out.println("How many pennies do you have in your piggy bank?");
        totalPennies = keyboard.nextInt();
        keyboard.nextLine();

        convertPennies(totalPennies);

    }

    public static void convertPennies(int origTotalPennies)
    {

        int pennies, nickels, dimes, quarters, dollars;

        System.out.println("\nYour original piggy bank had " + origTotalPennies + " pennies.\n");
        System.out.println("That means you have:\n");

        dollars = origTotalPennies / 100;
        pennies = origTotalPennies % 100;
        System.out.println(dollars + " dollars,");

        quarters = pennies / 25;
        pennies = pennies % 25;
        System.out.println(quarters + " quarters,");

        dimes = pennies / 10;
        pennies = pennies % 10;
        System.out.println(dimes + " dimes,");

        nickels = pennies / 5;
        pennies = pennies % 5;
        System.out.println(nickels + " nickels,");

        System.out.println(pennies + " pennies.");

    }

}
