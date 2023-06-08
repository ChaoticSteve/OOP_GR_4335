package VendingMachines;

import Domen.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int machineVolume;
    private List<Product> products;
    public VendingMachine(int volume){
        this.machineVolume = volume;
        products = new ArrayList<Product>();
    }

    public int getMachineVolume() {
        return machineVolume;
    }

    public void setMachineVolume(int machineVolume) {
        this.machineVolume = machineVolume;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public void addProduct(Product product){
        this.products.add(product);
    }
}
