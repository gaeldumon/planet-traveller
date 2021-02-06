public class Planet {
    private final String name;
    private final long earthDistance;
    private final double gravity;
    private final boolean isGas;

    public String getName() {
        return name;
    }

    public long getEarthDistance() {
        return earthDistance;
    }

    public double getGravity() {
        return gravity;
    }

    public boolean isGas() {
        return isGas;
    }

    public Planet(String name, long earthDistance, double gravity, boolean isGas) {
        this.name = name;
        this.earthDistance = earthDistance;
        this.gravity = gravity;
        this.isGas = isGas;
    }

}
