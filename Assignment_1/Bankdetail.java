class BankAccount{
    double Accnum;
    String Name;
    int balance;

    BankAccount(double Accnum){
        System.out.println("Account Number : " +Accnum);
    }
    BankAccount(double Accnum, String Name){
        this(Accnum);
        System.out.println("Account Number : " +Accnum+ " Account Holder Name: " +Name);
    }
    BankAccount(double Accnum, String Name, int balance){
        this(Accnum, Name);
        System.out.println("Account Number : "  +Accnum+ " Account Holder Name: " +Name+ " Balance: " +balance);
    }
}
public class Bankdetail {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(234567);
        BankAccount b2 = new BankAccount(8998764, "ac");
        BankAccount b3 = new BankAccount(234567899, "bd" ,55667);
    }
}
