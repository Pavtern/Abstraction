public class Square extends GeoFig {
    private double a;

    public void setA(double a) {
        this.a = a;
    }

    public double getP(){
        return a*4;
    }

    @Override
    public double getArea() {
        return a*a;
    }

    @Override
    public String toString() {
        return "Area = " + getArea() + "\n" + "Length = " + getP();
    }
}
