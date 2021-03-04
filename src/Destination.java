public class Destination {
    private final String name;
    /**
     * Distance from earth in kilometers
     */
    private final long earthDistance;
    private final double gravity;

    public Destination(String name, long earthDistance, double gravity) {
        this.name = name;
        this.earthDistance = earthDistance;
        this.gravity = gravity;
    }

    public String getName() {
        return name;
    }

    public long getEarthDistance() {
        return earthDistance;
    }

    public double getGravity() {
        return gravity;
    }
}
