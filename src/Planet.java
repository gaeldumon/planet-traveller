/**
 * @see "https://cnes.fr/fr/"
 */
public class Planet {
    private final String name;
    private final long earthDistance;
    private final double gravity;
    private final boolean isGas;

    /**
     * @param name Name of the planet
     * @param earthDistance Distance from Earth in km
     * @param gravity Planet's gravity in m/s²
     * @param isGas True if is a gas planet, false otherwise
     */
    public Planet(String name, long earthDistance, double gravity, boolean isGas) {
        this.name = name;
        this.earthDistance = earthDistance;
        this.gravity = gravity;
        this.isGas = isGas;
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

    public boolean isGas() {
        return isGas;
    }
}
