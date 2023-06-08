package Domen;

public class HotDrink extends Bottle{
    private int productTemperature;
    public HotDrink(int id, String name, String category, double price, int volume, int temperature){
        super(id, name, category, price, volume);
        this.productTemperature = temperature;
    }

    public int getProductTemperature() {
        return productTemperature;
    }

    public void setProductTemperature(int productTemperature) {
        this.productTemperature = productTemperature;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Temperature=" + productTemperature;
    }
}
