package Classes;

public class ComplexNumber {
    private double a;
    private double b;
    public ComplexNumber(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }

    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", this.getA(), this.getB());
    }
}
