public class Traveller {
    private final String name;
    private final Destination destination;
    private final Transportation transportation;
    private final int weightOnDestination;
    private final int ageOnDestination;
    /**
     * Duration of travel to chosen destination, in year
     */
    private final double travelDuration;

    public Traveller(String name, int age, int weight, Destination destination, Planet departure, Transportation transportation) {
        this.name = name;
        this.destination = destination;
        this.transportation = transportation;
        this.weightOnDestination = (int) ((weight * this.destination.getGravity()) / departure.getGravity());
        this.travelDuration = this.destination.getEarthDistance() / this.transportation.getKmy();
        this.ageOnDestination = (int) ((this.travelDuration >= 1) ? (age + this.travelDuration) : age);
    }

    public String getName() {
        return name;
    }

    public Destination getDestination() {
        return destination;
    }

    public int getWeightOnDestination() {
        return weightOnDestination;
    }

    public int getAgeOnDestination() {
        return ageOnDestination;
    }

    public double getTravelDuration() {
        return travelDuration;
    }
}
