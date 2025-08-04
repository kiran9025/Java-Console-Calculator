package Task_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator app You can perform addition, subtraction, multiplication and division ");
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Enter the first Operator : ");
            double a = sc.nextDouble();
            System.out.println("Enter the Second Operator : ");
            double b = sc.nextDouble();
            System.out.println("Enter the Operations to be Performed: addition, subtraction, multiplication, division");
            String operation = sc.next().toLowerCase();
            Calculator calculator = new Calculator();
            double result = switch (operation) {
                case "addition" -> calculator.addition(a, b);
                case "subtraction" -> calculator.subtraction(a, b);
                case "multiplication" -> calculator.multiplication(a, b);
                case "division" -> calculator.division(a, b);
                default -> throw new IllegalArgumentException("Enter the valid Operation");
            };

            System.out.printf("Result : %.2f\n", result);
            System.out.println("Do you want to perform other calculations ? (yes/no)");
            choice = sc.next().toLowerCase();
        }while (choice.equals("yes") || choice.equals("y"));
        System.out.println("Calculator Application is Closed Run again to perform Calculations.....");
        sc.close();
    }

}