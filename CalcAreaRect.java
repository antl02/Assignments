import java.util.Scanner;

public class CalcAreaRect
{

    public static Scanner keyboard = new Scanner(System.in);

    public static double areaRect;
    public static double length;
    public static double width;

    public static void main(String[] args)
    {

        System.out.println("What is the length of your rectangle?");
        length = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("\nWhat is the width of your rectangle?");
        width = keyboard.nextDouble();
        keyboard.nextLine();

        calcArea();


        double dblTotal = 1231345.789;
        int intValue = 1234567;
        String stringVal = "Hello World Happy Birthday";

        System.out.printf("Total is: $%,.2f%n", dblTotal);
        System.out.printf("Total: %-10.2f:%n ", dblTotal);
        System.out.printf("% 4d%n", intValue);
        System.out.printf("%20.10s\n", stringVal);
        String s = "Hello World";
        System.out.printf("The String object %s is at hash code %h%n", s, s);

    }

    public static void calcArea()
    {

        areaRect = length * width;
        System.out.println("\nThe area of a rectangle with a length of " + length +
                " and a width of " + width + " is " + areaRect);

    }

}
