package Task1;

public class RectangleComputation {
    public static void main(String[] args) {
        double length, width, area, perimeter;

        length = 12.4;
        width = 7.5;

        area = length * width;
        perimeter = (length + width) * 2;

        System.out.printf("Area of Rectangle is: %.2f\n", area);
        System.out.printf("Perimeter of Rectangle is: %.2f", perimeter);
    }
}
