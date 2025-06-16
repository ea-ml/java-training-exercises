import java.util.Arrays;

public class Triangle extends Shape{

    private final double[] sides = new double[3];
    private final double base;
    private final double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return Arrays.stream(sides).sum();
    }

    public double[] getSides() { return sides; }
    public double getBase() { return base; }
    public double getHeight() { return height; }

}
