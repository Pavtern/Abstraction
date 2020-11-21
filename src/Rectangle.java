public class Rectangle extends Square {
    private double a;
    private double b;

    public void setAB(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double getP() {
        return 2*a+2*b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
