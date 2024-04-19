package exceptionbasics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello");

        System.out.println("Enter two numbers : ");

            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int result = a / b;
                System.out.println(a + "/" + b + " = " + result);
            } catch (InputMismatchException e) {
                System.out.println("Sorry provided input is not correct");
            }

        System.out.println("Anything more you want?");

        System.out.println("Please provide your feedback");

        System.out.println("Thank You");


    }

}