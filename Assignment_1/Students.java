class Student{
    String name;
    int roll_no;
    double phone_no;
    String address;
    
    Student(String name, int roll_no, double phone_no, String address){
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
    }
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Roll number : " + roll_no);
        System.out.println("Phone number : " + phone_no);
        System.out.println("Address : " + address);
    }
}
public class Students {
    public static void main(String[] args) {
        Student s1 = new Student("Sam",1, 234567193, "234, jtk mumbai");
        Student s2 = new Student("John", 2, 568345098, "674, efuvfbm, navi mumbai");
        s1.display();
        s2.display();
    }
}
