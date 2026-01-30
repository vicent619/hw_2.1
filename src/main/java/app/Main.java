package app;

public class Main {
    private static final double CONV_K = 1.60934;

    public static void main(String[] args) {
        System.out.println("Project: Converter");
        System.out.println("Converts miles to kilometers and kilometers to miles");

        double miles = 10;
        double kilometers = convMilesToKilometers(miles);

        System.out.println(miles + " miles = " + kilometers + " kilometers");
    }

    private static double convMilesToKilometers(double miles) {
        return miles * CONV_K;
    }
}
