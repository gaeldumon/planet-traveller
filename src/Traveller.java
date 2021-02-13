
public class Traveller {
    private final String name;
    private final Planet destination;
    private final int weightOnDestination;
    private final int ageOnDestination;

    public Traveller(String name, int age, int weight, Planet destination, Planet departure, Transportation transportation) {
        this.name = name;
        this.destination = destination;
        this.weightOnDestination = (int) ((weight * this.destination.getGravity()) / departure.getGravity());
        this.ageOnDestination = (int) (age + (this.destination.getEarthDistance() / transportation.getSpeed()));
    }

    public String getName() {
        return name;
    }

    public Planet getDestination() {
        return destination;
    }

    public int getWeightOnDestination() {
        return weightOnDestination;
    }

    public int getAgeOnDestination() {
        return ageOnDestination;
    }
}
