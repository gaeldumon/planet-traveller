public class Screen {

    private final Destination[] destinations;
    private final Transportation[] transportations;
    private Traveller traveller;

    public Screen(Destination[] destinations, Transportation[] transportations) {
        this.destinations = destinations;
        this.transportations = transportations;
    }

    public void setTraveller(Traveller t) {
        this.traveller = t;
    }

    public void launchMenu() {
        System.out.println("||--------------------------------------||");
        System.out.println("||**** INTERPLANETARY TRAVEL SYSTEM ****||");
        System.out.println("||--------------------------------------||");
        System.out.println("\nAVAILABLE DESTINATIONS :");

        for (int i = 0; i < this.destinations.length; i++) {
            System.out.printf("%s\t--> press %d\n", this.destinations[i].getName(), i);
        }

        System.out.println("\nAVAILABLE TRANSPORTATIONS :");

        for (int i = 0; i < this.transportations.length; i++) {
            System.out.printf("%s --> press %d\n", this.transportations[i].getLabel(), i);
        }
    }

    public void askUser() {
        System.out.println("INITIALIZING...");
    }

    public void generateOutput() {
        System.out.printf(
                "\nTRAVELLER : %s IS GOING TO : %s. TRAVEL DURATION : %s year(s)\nPROCESSING...\n",
                this.traveller.getName(),
                this.traveller.getDestination().getName(),
                this.traveller.getTravelDuration(Unit.YEAR)
        );

        System.out.printf("\nAt your arrival on %s you will weight %d kg and you will be %d years old.\n",
                this.traveller.getDestination().getName(),
                this.traveller.getWeightOnDestination(),
                this.traveller.getAgeOnDestination()
        );

        /*
        if (this.traveller.getDestination().isGas()) {
            System.out.println("Danger ! You are going to a giant gas, you will not be able to land anywhere !");
        }
        */
    }

    public void shutdown() {
        System.out.println("STOPPING SYSTEM... GOODBYE.");
    }
}
