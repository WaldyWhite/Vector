public class Vector {
    private double x;
    private double y;
    private double z;

    // Constructor
    public Vector (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        }
    // method that calculates the length of a vector Корень можно посчитать с помощью Math.sqrt()
    public double vectorLength () {
        return Math.sqrt(x * x + y *y + z * z);
    }
    // method that calculates the scalar product
    public double scalarProduct(Vector vector) {
        double result = x * vector.x + y * vector.y + z * vector.z;
        return result;

    }

}
