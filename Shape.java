// Exercise 5

import java.util.Arrays;
import java.util.List;

public abstract class Shape {

    public abstract double getArea();
    public abstract double getPerimeter();

    public static List<Double> computeArea(Shape... shapes) {
        return Arrays.stream(shapes)
                .mapToDouble(Shape::getArea)
                .boxed()
                .toList();
    }

    public static List<Double> computerPerimeter(Shape... shapes) {
        return Arrays.stream(shapes)
                .mapToDouble(Shape::getPerimeter)
                .boxed()
                .toList();
    }
}
