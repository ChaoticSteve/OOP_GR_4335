import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) {
        Product item1 = new Product(01, "Lays", "Chips", 89);
        Product item2 = new Bottle(02, "BonAqua", "Water", 40, 500);
        Product item3 = new HotDrink(03, "MacCoffee", "Coffee", 20, 200, 40);
        item1.setProductPrice(80);
        VendingMachine iMachine = new VendingMachine(200);
        iMachine.addProduct(item1);
        iMachine.addProduct(item2);
        iMachine.addProduct(item3);
        iMachine.addProduct(new Product(04, "Milka", "Chocolate", 35));
        iMachine.addProduct(new Bottle(05, "Pepsi", "Soda", 33, 250));
        iMachine.addProduct(new HotDrink(06, "NexTea", "Tea", 15, 200, 45));
        for (Product product: iMachine.getProducts()){
            System.out.println(product.toString());
        }
    }
}