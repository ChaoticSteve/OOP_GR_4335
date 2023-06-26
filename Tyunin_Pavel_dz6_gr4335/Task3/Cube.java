package Task3;

public class Cube implements Area, Volume{
    private int edge;
    public Cube(int edge){
        this.edge = edge;
    }
    @Override
    public double area() {
        return 6 * this.edge * this.edge;
    }

    @Override
    public double volume() {
        return this.edge * this.edge * this.edge;
    }
}
