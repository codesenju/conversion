import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        final double ten = 10D;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Kelvin: ");
        double kelvin = in.nextDouble();

        Conversion c = new Conversion();
        System.out.println("Kel to Cel: " + c.kelToCel(kelvin));
        System.out.println("Lbs to KG: " + c.lbsToKg(ten));
        System.out.println("Miles to KM: " + c.milesToKm(ten));
    }
}
