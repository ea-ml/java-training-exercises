public class Rectangle extends Shape{

    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width * 2) + (height * 2);
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }

}
