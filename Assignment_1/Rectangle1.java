import java.util.Scanner;

class Area{
    int breadth;
    int length;
    void setDim(int breadth, int length){
        this.breadth = breadth;
        this.length = length;
    }
    int getArea(){
        return length * breadth;
    }
}
public class Rectangle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Area rectangle = new Area();

        System.out.print("Enter length of rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = scanner.nextInt();

        rectangle.setDim(length, breadth);
        int area = rectangle.getArea();
        System.out.println("Area of rectangle: " + area);
    }
}
