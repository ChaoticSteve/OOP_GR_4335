package Task4;

public class Square extends Shape{
    private int sideLength;
    public Square(int sideLength){
        this.sideLength = sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    int area() {
        return this.getSideLength() * this.getSideLength();
    }
}
