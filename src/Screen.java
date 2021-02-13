public class Screen {

    public void launchMenu(Planet[] planets, Transportation[] transportations) {
        System.out.println("||--------------------------------------||");
        System.out.println("||**** INTERPLANETARY TRAVEL SYSTEM ****||");
        System.out.println("||--------------------------------------||");
        System.out.println("\nAVAILABLE DESTINATIONS :");

        for (int i = 0; i < planets.length; i++) {
            System.out.printf("%s\t--> press %d\n", planets[i].getName(), i);
        }

        System.out.println("\nAVAILABLE TRANSPORTATIONS :");

        for (int i = 0; i < transportations.length; i++) {
            System.out.printf("%s\t--> press %d\n", transportations[i].getLabel(), i);
        }
    }

    public void askUser() {
        System.out.println("INITIALIZING...");
    }

    public void generateOutput(Traveller traveller) {
        System.out.printf(
                "\nTRAVELLER : %s IS GOING TO : %s.\nPROCESSING...\n",
                traveller.getName(),
                traveller.getDestination().getName()
        );

        System.out.printf("\nAt your arrival on %s you will weight %d kg and you will be %d years old.\n",
                traveller.getDestination().getName(),
                traveller.getWeightOnDestination(),
                traveller.getAgeOnDestination()
        );

        if (traveller.getDestination().isGas()) {
            System.out.println("Danger ! You are going to a giant gas, you will not be able to land anywhere !");
        }
    }

    public void shutdown() {
        System.out.println("STOPPING SYSTEM... GOODBYE.");
    }
}
