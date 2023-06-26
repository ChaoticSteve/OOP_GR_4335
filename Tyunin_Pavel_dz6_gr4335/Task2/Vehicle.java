package Task2;

public abstract class Vehicle {
    protected int maxSpeed;
    protected String type;
    public Vehicle(int maxSpeed, String type){
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
     public int getMaxSpeed(){
        return maxSpeed;
     }

    public String getType() {
        return type;
    }
    abstract public double calculateAllowSpeed();
}
