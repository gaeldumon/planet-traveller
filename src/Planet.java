public class Planet extends Destination {
    private final boolean isGas;

    public Planet(String name, long earthDistance, double gravity, boolean isGas) {
        super(name, earthDistance, gravity);
        this.isGas = isGas;
    }

    public boolean isGas() {
        return isGas;
    }
}
