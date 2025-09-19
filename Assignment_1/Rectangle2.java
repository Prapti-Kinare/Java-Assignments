import java.util.Scanner;
class Area{
    int length;
    int breadth;
    Area(int length, int breadth){
        this.breadth = breadth;
        this.length = length;
    }
    int returnArea(){
        return length * breadth;
    }
}
public class Rectangle2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter length of the rectangle: ");
    int length = scanner.nextInt();
    System.out.println("Enter breadth of the rectangle: ");
    int breadth = scanner.nextInt();

    Area rectangle2 = new Area(length, breadth);
    int area = rectangle2.returnArea();
    System.out.println("Area of the rectangle: " + area);   
    }
}
