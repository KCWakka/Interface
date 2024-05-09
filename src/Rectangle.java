public class Rectangle implements Math {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public double area() {
        return (length * width);
    }

    public double perimeter() {
        return (2 * length + 2 * width);
    }
    //interface methods
    public int someMath() {
        return length + width;
    }
    public void addMath() {
        length = (length * width);
        width = (2 * length + 2 * width);
    }
    public boolean isMath(int value) {
        return perimeter() % value == 0;
    }
}
