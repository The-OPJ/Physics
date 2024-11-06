public class Vector {
    private double[] vector;

    public Vector(double i, double j, double k) {
        this.vector = new double[]{ i, j, k };
    }

    public double magnitude() {
        return Math.sqrt(vector[0] * vector[0] + vector[1] * vector[1] + vector[2] * vector[2]);
    }

    public Vector direction() {
        double mag = magnitude();
        return new Vector(vector[0] / mag, vector[1] / mag, vector[2] / mag);
    }

    public double i() {
        return vector[0];
    }

    public void setI(double i) {
        vector[0] = i;
    }

    public double j() {
        return vector[1];
    }

    public void setJ(double j) {
        vector[1] = j;
    }

    public double k() {
        return vector[2];
    }

    public void setK(double k) {
        vector[2] = k;
    }

    public static double dot(Vector v, Vector w) {
        if (v == null || w == null) throw new IllegalArgumentException("Vectors cannot be null ");

        return v.i() * w.i() + v.j() * w.j() + v.k() + w.k();
    }

    public static Vector cross(Vector v, Vector w) {
        if (v == null || w == null) throw new IllegalArgumentException("Vectors cannot be null ");

        double i = v.j() * w.k() - v.k() * w.j();
        double j = v.i() * w.k() - v.k() * w.i();
        double k = v.i() * w.j() - v.j() * w.i();

        return new Vector(i, -j, k);
    }

    public static double angleBetween(Vector v, Vector w) {
        if (v == null || w == null) throw new IllegalArgumentException("Vectors cannot be null ");

        double cosOfAngle = Vector.dot(v, w) / (v.magnitude() * w.magnitude());

        return Math.acos(cosOfAngle);
    }
}
