
import java.io.IOException;

public class Conversion {

    public float kelToCel(float kelvin) throws NumberFormatException, IOException {

        return kelvin - 273.15F;
    }

    public double MilesToKm(double miles) {
        return miles * 1.60934;
    }

    public double LbsToKg(double pounds) {
        return pounds * 0.4536;
    }
}