package OOP.ABSTRACTION;

public class Test {
    public static void main(String [] args){
        Circle circle = new Circle("green", 7);
        Rectangle rect = new Rectangle(8.0, 4.8, "orange");
        Rectangle rect2 = new Rectangle();
        System.out.println(circle.toString());
        System.out.println(rect.toString());

    }
}
