package Classes;
//класс для акционного клиента наследник класса Actor
public class PromoClient extends Actor{
    // поле название акции
    private String promoName;
    // поле id клиента
    private int idClient;
    // поле количества участников
    private static int countClients;
    // конструктор класса
    public PromoClient(String name, String promoName, int idClient) {
        super(name);
        this.promoName = promoName;
        this.idClient = idClient;
        this.countClients += 1;
    }
    // функция получения названия акции
    public String getPromoName() {
        return promoName;
    }
    // функция получения id клиента
    public int getIdClient() {
        return idClient;
    }
    // функция получения количества акционных клиентов
    public int getCountClients() {
        return countClients;
    }
    // функция получения имени клиента
    @Override
    public String getName() {
        return super.name;
    }
    // функция проверки забрал ли заказ
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    // функция проверки сделал ли заказ
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    // функция забрать заказ
    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }
    // функция сделать заказ
    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }
    //// функция получения текущего класса
    public Actor getActor() {
        return this;
    }
}

