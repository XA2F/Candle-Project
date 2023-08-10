public class Candle implements Serializable {

    private String name;
    private int quantity;
    private int burnTime;
    private double dollarPerBurnTime;
    private double price;

    public Candle(String name, int quantity, int burnTime, double dollarPerBurnTime, double price) {
        this.name = name;
        this.quantity = quantity;
        this.burnTime = burnTime;
        this.dollarPerBurnTime = dollarPerBurnTime;
        this.price = price;
    }

}