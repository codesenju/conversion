import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        // final double ten = 10D;
        Scanner in = new Scanner(System.in);
        double userInput = 0;
        String answer = "y";
        Conversion c = new Conversion();

        System.out.println("Menu");
        System.out.println("---");
        System.out.println("a) Kelvin to Celsius");
        System.out.println("b) Pounds to Kilograms");
        System.out.println("c) Miles to Kilometres");
        System.out.println("");
        
        do {
            System.out.print("enter a, b or c : ");
            String menuOption = in.next();

            if (menuOption.toLowerCase().contains("a")) {

                System.out.print("Enter Kelvin: ");
                userInput = in.nextDouble();
                System.out.println(userInput + " Kelvin = " + c.kelToCel(userInput) + " Celsius");

            } else if (menuOption.toLowerCase().contains("b")) {
                System.out.print("Enter Pounds: ");
                userInput = in.nextDouble();
                System.out.println(userInput + " lbs = " + c.lbsToKg(userInput) + " kg");

            } else if (menuOption.toLowerCase().contains("c")) {
                System.out.print("Enter Miles: ");
                userInput = in.nextDouble();
                System.out.println(userInput + " Miles = " + c.milesToKm(userInput) + " km");
            }

            System.out.println("Do you want to go back to Main Menu (y/n)? ");
            answer = in.next();

        } while (answer.toLowerCase().contains("y"));

        in.close();

    }
}
