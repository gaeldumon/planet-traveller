public class Moon extends Destination {
    private final Planet parentPlanet;

    public Moon(String name, long earthDistance, double gravity, Planet parentPlanet) {
        super(name, earthDistance, gravity);
        this.parentPlanet = parentPlanet;
    }

    public Planet getParentPlanet() {
        return parentPlanet;
    }
}
