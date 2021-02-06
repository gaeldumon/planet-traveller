
public class Traveller {
    private final String name;
    private final Planet destination;
    private final int weightOnDestination;
    private final int ageOnDestination;

    public Traveller(String name, int age, int weight, Planet destination, Planet departure) {
        this.name = name;
        this.destination = destination;
        this.weightOnDestination = (int) ((weight * this.destination.getGravity()) / departure.getGravity());
        int shipSpeed = 30_274_560;
        this.ageOnDestination = (int) (age + (this.destination.getEarthDistance() / shipSpeed));
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
