class student{
    String name;
    int roll_no;
    
    student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
}
public class Student1 {
    public static void main(String[] args) {
        student s =  new student("John", 2);
        System.out.println("Name: " + s.name);
        System.out.println("roll number: " + s.roll_no);
    }
}
