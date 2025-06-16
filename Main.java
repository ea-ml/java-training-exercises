import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Exercise 1 Output
        System.out.println(
                findNearestAdjacent(4, 8, 6, 1, 2, 9, 4)
        );

        // Exercise 3 Output
        new CustomString().enumerate("HELLO WORLD!");

        // Exercise 4 Output
        System.out.println(PerfectNumber.test(6));


        // Exercise 5 Output
        Shape[] shapes = new Shape[]{
                new Circle(4),
                new Rectangle(2, 4),
                new Triangle(12, 9)
        };

        System.out.println(Shape.computeArea(shapes));
        System.out.println(Shape.computerPerimeter(shapes));
    }

    // Exercise 1

    private static int findNearestAdjacent(int... numbers) {
        int lowestDistance = -1, index = -1;

        for(int i = 0; i < numbers.length - 1; i++) {
            int distance = Math.abs(numbers[i] - numbers[i + 1]);
            if(distance <= lowestDistance || lowestDistance == -1) {
                lowestDistance = distance;
                index = i;
            }
        }

        return index;
    }


}