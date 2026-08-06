package entities;

public class Triangle {
    public double x;
    public double y;
    public double z;

    public Triangle() {
    }

    public Triangle(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }



    public double area() {
        double p = (x + y + z) / 2.0;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }
}
