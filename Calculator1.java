/**
 *
 * @author 6284773
 *
 * Title:       Pre-Challenge Calculator
 * Semester:    COP2210 - Spring 2022
 * Professor:   Charters
 * Description: This program is our first IntelliJ program to
 *              practice writing methods, and calling them.
 *
 *
 */


import java.util.Scanner;

public class Calculator1 {

    /**
     * @param args
     * Calling 4 methods to calculate:
     * addition(), subtraction(), multiplication(), and division()
     * Each method will receive 2 parameters, and will return an answer.
     */
    public static void main(String args[])

    {

        double num1;
        double num2;
        double sum;
        double diff;
        double prod;
        double quo;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is the first number?");
        num1 = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("What is the second number?");
        num2 = keyboard.nextDouble();
        keyboard.nextLine();


        sum = addition(num1, num2);
        diff = subtraction(num1, num2);
        prod = multiplication(num1, num2);
        quo = division(num1, num2);



        System.out.println("The sum of " + num1 + " + " + num2 + " = " + sum);
        System.out.println("The difference of " + num1 + " - " + num2 + " = " + diff);
        System.out.println("The product of " + num1 + " * " + num2 + " = " + prod);
        System.out.println("The quotient of " + num1 + " / " + num2 + " = " + quo);


    }

    /**
     *
     * @param numA - num1 passed from main
     * @param numB - num2 passed from main
     *             This method will ad the 2 numbers together
     * @return sum - The sum of these 2 parameters.
     */
    public static double addition(double numA, double numB)
    {
        double sum;
        sum = numA + numB;
        return sum;

    }

    public static double subtraction(double numA, double numB)
    {
        double diff;
        diff = numA - numB;
        return diff;

    }

    public static double multiplication(double numA, double numB)
    {
        double prod;
        prod = numA * numB;
        return prod;

    }
    public static double division(double numA, double numB)
    {
        double quo;
        quo =  numA / numB;
        return quo;

    }


}
