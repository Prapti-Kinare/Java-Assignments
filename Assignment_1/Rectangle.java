class Rectangles{
    int length;
    int breadth;
    Rectangles(int length,int breadth){
        this.length =length;
        this.breadth= breadth;
    }
    void area(){
        System.out.println("area of rectangle : " + length * breadth);
    }
}
public class Rectangle {
    public static void main(String[] args) {
        Rectangles r = new Rectangles(4, 5);
        Rectangles r1 = new Rectangles(5, 8);
        r.area();
        r1.area();
    }
}
