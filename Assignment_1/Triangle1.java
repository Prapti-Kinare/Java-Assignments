class Triangle {
    int side1;
    int side2;
    int side3;
    Triangle() {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }

    int getPerimeter() {
        return side1 + side2 + side3;
    }
    double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
public class Triangle1 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        System.out.println("Perimeter of Triangle: " + triangle.getPerimeter());
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}
