package Week1Calculator;

import java.util.Scanner;

public class Calculator {
    static int sum(int a, int b){
        int result = a + b;
        System.out.println("Result: " + result);
        return result;
    }
    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Result: " + result);
        return result;
    }
    static int times(int a, int b){
        int result = a * b;
        System.out.println("Result: " + result);
        return result;
    }
    static double divided(double a, double b){
        if (b == 0){
            System.out.println("The second number cannot be 0!");
            return 0;
        }
        double result = a / b;
        System.out.println("Result: " + result);
        return result;
    }
    static int mode(int a, int b){
        int result = a % b;
        System.out.println("Result: " + result);
        return result;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int select;

        String menu = "1- Sum (+) \n"
                    + "2- Minus (-) \n"
                    + "3- Times (*) \n"
                    + "4- Divided (/) \n"
                    + "5- Mode (%) \n"
                    + "0- Quit\n";

        while(true){
            System.out.println(menu);
            System.out.print("Select an operation: ");
            select = scanner.nextInt();

            if (select == 0){
                break;
            }
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    mode(a, b);
                    break;
                default:
                    System.out.println("Invalid operation!");
            }
        }
    }
}
