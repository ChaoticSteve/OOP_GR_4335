package Interfaces;
//интерфейс для возврата
public interface iReturnOrder {
    //проверка на возратность товара
    boolean isReturnable(boolean returnable);
    //сделать возврат
    void makeReturn();
}
