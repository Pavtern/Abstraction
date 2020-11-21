
public class Main {

    public static void main(String[] args) {
        Square square = new Square();
        square.setA(4);
        System.out.println("Square" + "\n" + square);
        Circle circle = new Circle(4);
        System.out.println("\n" + "Circle" + "\n" + circle);
        Rectangle rectangle = new Rectangle();
        rectangle.setAB(3,5);
        System.out.println("\n" + "Rectangle" + "\n" + rectangle);

    }
}

