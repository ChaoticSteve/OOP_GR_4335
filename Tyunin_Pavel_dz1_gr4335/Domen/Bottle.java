package Domen;

public class Bottle  extends Product{
    private int productVolume;

    public Bottle(int id, String name, String category, double price, int volume){
        super(id, name, category, price);
        this.productVolume = volume;
    }

    public int getProductVolume() {
        return productVolume;
    }

    public void setProductVolume(int productVolume) {
        this.productVolume = productVolume;
    }

    @Override
    public String toString() {
        return super.toString()  +
                ", Volume=" + productVolume;
    }
}
