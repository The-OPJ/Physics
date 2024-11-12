public class Particle {
    private double mass;
    private double charge;
    private Vector position;
    private Vector velocity;
    private Vector acceleration;

    public Particle(double m, double q, Vector pos, Vector vel, Vector accel) {
        mass = m;
        charge = q;
        position = pos;
        velocity = vel;
        acceleration = accel;
    }

    public Particle(double m, Vector pos, Vector vel, Vector accel) {
        mass = m;
        position = pos;
        velocity = vel;
        acceleration = accel;
    }

    public double getMass() { return mass; }

    public double getCharge() { return charge; }

    public Vector getPosition() { return position; }

    public Vector getVelocity() { return velocity; }

    public Vector getAcceleration() { return acceleration; }

    public void setMass(double mass) { this.mass = mass; }

    public void setCharge(double charge) { this.charge = charge; }

    public void setPosition(Vector position) { this.position = position; }

    public void setVelocity(Vector velocity) { this.velocity = velocity; }

    public void setAcceleration(Vector acceleration) { this.acceleration = acceleration; }

    public static double distance(Particle a, Particle b) {
        double deltaX = a.position.i() - b.position.i();
        double deltaY = a.position.j() - b.position.j();
        double deltaZ = a.position.k() - b.position.k();
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2) + Math.pow(deltaZ, 2));
    }


}
