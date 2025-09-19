import java.util.Scanner;
class Average1{
    int num1;
    int num2;
    int num3;
    Average1(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    void calculate(){
        double Average1 = (num1 + num2 + num3)/ 3.0;
        System.out.println("Average of three numbers: " + Average1);
    }
}
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();

        Average1 avg = new Average1(num1, num2, num3);
        avg.calculate();
    }    
}
