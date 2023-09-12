import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        // numbers 1 - 2

        Scanner num1 = new Scanner(System.in);
        System.out.println("Number 1: ");
        double number1 = num1.nextDouble();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Number 2: ");
        double number2 = num2.nextDouble();

        // boolean

        Scanner bool = new Scanner(System.in);
        System.out.println("Would you like to add a third number to the operation? Y or N ");
        String answer1 = bool.nextLine();

        if (answer1.equalsIgnoreCase("Y")) {

            Scanner num3 = new Scanner(System.in);
            System.out.println("Number 3: ");
            double number3 = num3.nextDouble();

            Scanner type = new Scanner(System.in);
            System.out.println("Type A for addition, S for subtraction, M for multiplication, D for division: ");
            String typeAnswer = type.nextLine();

            if (typeAnswer.equalsIgnoreCase("A")) {
                double result = number1 + number2 + number3;
                System.out.println("Result = " + result);
            } else if (typeAnswer.equalsIgnoreCase("S")) {
                double result = number1 - number2 - number3;
                System.out.println("Result = " + result);
            } else if (typeAnswer.equalsIgnoreCase("M")) {
                double result = number1 * number2 * number3;
                System.out.println("Result = " + result);
            } else if (typeAnswer.equalsIgnoreCase("D")) {
                double result = number1 / number2 / number3;
                System.out.println("Result = " + result);
            } else {
                System.out.println("Invalid operation type.");
            }

        } else if (answer1.equalsIgnoreCase("N")) {

            System.out.println("Operation canceled.");

        } else {

            System.out.println("invalid answer. Try again!");

        }

        Scanner type = new Scanner(System.in);
        System.out.println("Type A for addition, S for subtraction, M for multiplication, D for division: ");
        String typeAnswer = type.nextLine();

        if (typeAnswer.equalsIgnoreCase("A")) {
            double result = number1 + number2;
            System.out.println("Result = " + result);
        } else if (typeAnswer.equalsIgnoreCase("S")) {
            double result = number1 - number2;
            System.out.println("Result = " + result);
        } else if (typeAnswer.equalsIgnoreCase("M")) {
            double result = number1 * number2;
            System.out.println("Result = " + result);
        } else if (typeAnswer.equalsIgnoreCase("D")) {
            double result = number1 / number2;
            System.out.println("Result = " + result);
        } else {
            System.out.println("Invalid operation type.");
        }

    }
}
