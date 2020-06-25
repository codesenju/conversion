
import java.io.IOException;

public class Conversion {

    public float kelToCel(float kelvin) throws NumberFormatException, IOException {
    // Kelvin to Degree Celsius Conversion
    float celsius = kelvin - 273.15F;
    return celsius;
}


}