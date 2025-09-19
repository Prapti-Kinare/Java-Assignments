class Employee {
    String name;
    int yearOfJoining;
    String address;
    double salary;

    Employee(String name, int yearOfJoining, String address, double salary) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
        this.salary = salary;
    }
}

public class Employees {
    public static void main(String[] args) {
        Employee e1 = new Employee("Robert", 19, "64C- WallsStreat", 40000);
        Employee e2 = new Employee("Sam", 2000, "68D- WallsStreat", 20000);
        Employee e3 = new Employee("John", 1999, "26B- WallsStreat", 30000);

        System.out.println("Name\tYear of joining\tAddress\tSalary");
        System.out.println(e1.name+ "\t" + e1.yearOfJoining + "\t\t" + e1.address);
        System.out.println(e2.name+ "\t" + e2.yearOfJoining + "\t\t" + e2.address);
        System.out.println(e3.name+ "\t" + e3.yearOfJoining + "\t\t" + e3.address);
    }
}
