package gr.aueb.cf.cf9.ch12.model;

public class PointApp {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(12,800);
        Point p3 = new Point(48,120);

        p1.setX(10);
        p1.setY(40);
        p2.setY(100);

        System.out.println(p1.pointToString());
        System.out.println(p2.pointToString());
        System.out.println(p3.pointToString());
    }
}
