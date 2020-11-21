import static java.lang.Math.*;

public class Circle extends GeoFig {

    double r;

    Circle(double r){
        this.r = r;
    }

    public double getArea() {
        double s = PI * Math.pow(r, 2);
        return s;
    }

    public double getC() {
        double c = PI * r * 2;
        return c;
    }

    @Override
    public String toString() {
        return "Area = " + getArea() + "\n" + "Length = " + getC();
    }
}
