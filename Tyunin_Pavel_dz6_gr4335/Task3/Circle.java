package Task3;

public class Circle implements Area{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double area() {
        return 2 * 3.14 * this.radius;
    }
}
