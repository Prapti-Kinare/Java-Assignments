class Triangle1 {
    int side1;
    int side2;
    int side3;
    Triangle1(int side1, int side2, int side3) {
        this.side1 =side1;
        this.side2 =side2;
        this.side3 =side3;
    }
    int perimeter() {
        return side1 + side2 + side3;
    }

    double area() {
        double s = perimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
public class Triangle {
    public static void main(String[] args) {
        Triangle1 t = new Triangle1 (3,4,5);
        System.out.println("Perimeter of Triangle: " + t.perimeter());
        System.out.println("Area of Triangle: " + t.area());
}
}