public class Traveller {
    private final String name;
    private final int currentAge;
    private final int currentWeight;
    private final Destination departure;
    private final Destination destination;
    private final Transportation transportation;

    public Traveller(String name, int age, int weight, Destination destination, Planet departure, Transportation transportation) {
        this.name = name;
        this.currentAge = age;
        this.currentWeight = weight;
        this.destination = destination;
        this.departure = departure;
        this.transportation = transportation;
    }

    public String getName() {
        return this.name;
    }

    public Destination getDestination() {
        return this.destination;
    }

    public int getWeightOnDestination() {
        return (int) ((this.currentWeight * this.destination.getGravity()) / this.departure.getGravity());
    }

    public int getAgeOnDestination() {
        int ageOnDestination;
        if (this.getTravelDuration(Unit.YEAR) >= 1) {
            ageOnDestination = (int) (this.currentAge + this.getTravelDuration(Unit.YEAR));
        } else {
            ageOnDestination = this.currentAge;
        }
        return ageOnDestination;
    }

    public double getTravelDuration(Unit unit) {
        double travelDuration = 0;

        if (unit == Unit.SEC) {
            travelDuration = this.destination.getEarthDistance() / this.transportation.getVelocity(Unit.KM_PER_SEC);
        } else if (unit == Unit.HOUR) {
            travelDuration = this.destination.getEarthDistance() / this.transportation.getVelocity(Unit.KM_PER_HOUR);
        } else if (unit == Unit.DAY) {
            travelDuration = this.destination.getEarthDistance() / (this.transportation.getVelocity(Unit.KM_PER_DAY));
        } else if (unit == Unit.YEAR) {
            travelDuration = this.destination.getEarthDistance() / this.transportation.getVelocity(Unit.KM_PER_YEAR);
        }

        return travelDuration;
    }
}
