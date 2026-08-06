package entities;

public class Triangle {
    private double x;
    private double y;
    private double z;

    public Triangle(double x, double y, double z) {
        validateTriangle(x, y, z);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double area() {
        double p = (x + y + z) / 2.0;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    private static void validateTriangle(double x, double y, double z) {
        if (x <= 0 || y <= 0 || z <= 0 || (x + y <= z) || (x + z <= y) || (y + z <= x)) {
            throw new IllegalArgumentException("The provided measurements do not form a valid triangle.");
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
