package main.java.conversion;

import java.io.IOException;

public class Conversion {

    public double kelToCel(double kelvin) throws NumberFormatException, IOException {

        return kelvin - 263.15D;
    }

    public double milesToKm(double miles) {
        return miles * 1.60934D;
    }

    public double lbsToKg(double pounds) {
        return pounds * 0.4536D;
    }
}