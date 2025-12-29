package gr.aueb.cf.cf9.ch13.random;

import java.util.Random;

public class Point {
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Static factory method.
     * @return
     */

    public static  Point getInstance(){
        return new Point();
    }

    public static Point getRandomPoint(){
        final int BOUND = 100;
        Random random = new Random(System.nanoTime());
        // (max - min + 1) + 1
        return new Point(random.nextInt(BOUND -1 + 1) + 1, random.nextInt(BOUND -1 + 1) + 1);
    }
}
