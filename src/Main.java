import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Candle[] candles = {
                new Candle("Luscious Lavender", 3, 5, 7.50),
                new Candle("Fragrant Floral's", 5, 7, 18.75),
                new Candle("Spicy N' Dicey", 2, 12, 11.98),
                new Candle("Ocean Breeze", 4, 8, 14.99),
                new Candle("Sweet Serenity", 1, 10, 9.99)
        };

        int totalBurnTime = calculateTotalBurnTime(candles);
        double totalDollarPerBurnTime = calculateTotalDollarPerBurnTime(candles);
        double totalPrice = calculateTotalPrice(candles);
        printReceipt(candles, totalBurnTime, totalDollarPerBurnTime, totalPrice);

    }

    public static int calculateTotalBurnTime(Candle[] candles) {


    }

    public static double calculateTotalDollarPerBurnTime(Candle[] candles) {

    }

    public static double calculateTotalPrice(Candle[] candles) {


    }

    public static void printReceipt(Candle[] candles, int totalBurnTime,
                                    double totalDollarPerBurnTime, double totalPrice) {
    }

}