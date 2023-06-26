package Task4;

public class Rectangle extends Shape{
    private int length;
    private int height;
    public Rectangle(int length, int height){
        this.length = length;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    @Override
    public int area() {
        return this.getHeight() * this.getLength();
    }
}
