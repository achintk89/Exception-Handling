package exceptionbasics;

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello");

        System.out.println("Enter two numbers : ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

       try {
           int result = a / b;
           System.out.println(a + "/" + b + " = " + result);
       }
       catch(ArithmeticException e){
            System.out.println("Sorry you can't divide a number by zero");
        }



        System.out.println("Anything more you want?");

        System.out.println("Please provide your feedback");

        System.out.println("Thank You");


    }

}
