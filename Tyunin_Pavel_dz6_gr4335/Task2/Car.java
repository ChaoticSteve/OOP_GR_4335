package Task2;

public class Car extends Vehicle{
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calculateAllowSpeed() {
        return this.getMaxSpeed() * 0.8;
    }
}
