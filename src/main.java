import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String args[]){
        //option 1
        boolean primeIsTrue = true;
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = key.nextInt();
        if(number == 2){
            System.out.println(number + " is a prime number.");
        }
        else if(number == 1 || number == 0){
            System.out.println(number + " is not a prime number.");
        }
        else {
            for (int x = 2; x < number; x++) {
                if(number%x == 0){
                    primeIsTrue = false;
                    break;
                }
            }
            if(primeIsTrue){
                System.out.println(number + " is a prime number.");
            }
            else {
                System.out.println(number + " is not a prime number.");
            }
        }
        //option 2
        boolean primeIsTrue2 = true;
        Random randomNumber = new Random();
        key = new Scanner(System.in);
        System.out.println("Would you like a random number to be tested? (y or n)");
        String answer = key.next();
        if(answer.equalsIgnoreCase("y")) {
            int number2 = randomNumber.nextInt(251);
            if (number2 == 2) {
                System.out.println(number2 + " is a prime number.");
            } else if (number2 == 1 || number2 == 0) {
                System.out.println(number2 + " is not a prime number.");
            } else {
                for (int x = 2; x < number2; x++) {
                    if (number2 % x == 0) {
                        primeIsTrue2 = false;
                        break;
                    }
                }
                if (primeIsTrue2) {
                    System.out.println(number2 + " is a prime number.");
                } else {
                    System.out.println(number2 + " is not a prime number.");
                }
            }
        }
        else {
            System.out.println("Thanks for playing!");
        }


    }

}
