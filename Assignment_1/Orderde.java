class order{
    double orderID;
    String customerName;
    double total;

    order(double orderID){
        this.orderID = orderID;
        System.out.println("This is one parameter Order Id: " + orderID);
    }
    order(double orderID, String customerName){
        this(orderID);
        this.orderID = orderID;
        this.customerName = customerName;
        System.out.println("This is two parameter Order ID: " + orderID + " Customer Name: " +customerName);
    }
    order(double orderID, String customerName, double total){
        this(orderID, customerName);
        this.orderID = orderID;
        this.customerName = customerName;
        this.total = total;
        System.out.println("This is two parameter Order ID: " + orderID + " Customer Name: " +customerName + " Total Amount: " +total);
    }
}
public class Orderde {
    public static void main(String[] args) {
        order o1 = new order(12345);
        order o2 = new order(123456, "PK");
        order o3 = new order(1234567, "tvz", 6543);
    }
}
