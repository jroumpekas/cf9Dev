package gr.aueb.cf.cf9.ch13.random;

public class PointMain {
    public static void main(String[] args) {
        Point p1 = Point.getInstance();
        Point p2 = Point.getRandomPoint();

        System.out.println("p1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("p2: (" + p2.getX() + ", " + p2.getY() + ")");
    }
}
