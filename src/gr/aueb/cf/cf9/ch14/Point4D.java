package gr.aueb.cf.cf9.ch14;

public class Point4D extends  Point3D{
    private double s;

    public Point4D(){

    }

    public Point4D(double x, double y, double z, double s) {
        super(x,y,z);
        this.s = s;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    @Override
    public void movePlusOne() {
        super.movePlusOne();
    }

    @Override
    protected void movePlus10() {
        super.movePlus10();
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + getZ() + s +")";
    }
}
