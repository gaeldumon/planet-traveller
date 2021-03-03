import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Planet mercury = new Planet("Mercury", 92_750_680L, 3.61, false);
        Planet venus = new Planet("Venus", 41_887_400L, 8.83, false);
        Planet earth = new Planet("Earth", 0, 9.81, false);
        Planet mars = new Planet("Mars", 77_790_890L, 3.75, false);
        Planet jupiter = new Planet("Jupiter", 628_311_100L, 26.0, true);
        Planet saturn = new Planet("Saturn", 1_277_566_000L, 11.2, true);
        Planet uranus = new Planet("Uranus", 2_722_681_000L, 10.5, true);
        Planet neptune = new Planet("Neptune", 4_353_298_000L, 13.3, true);
        Planet[] planets = {mercury, venus, earth, mars, jupiter, saturn, uranus, neptune};

        Transportation defaultShip = new Transportation("Apollo 11 Spacecraft (NASA)", 11.03);
        Transportation[] transportations = {defaultShip};

        Screen screen = new Screen();
        screen.launchMenu(planets, transportations);

        Scanner sc = new Scanner(System.in);

        System.out.println("\nAre you ready ? (y/n)");
        String userReady = sc.nextLine();

        while (userReady.toLowerCase().equals("y")) {

            screen.askUser();

            System.out.println("\nENTER NAME -> ");
            String username = sc.nextLine();

            System.out.println("\nENTER AGE -> ");
            int age = sc.nextInt();

            System.out.println("\nENTER WEIGHT (in KG) -> ");
            int weight = sc.nextInt();

            System.out.println("\nENTER DESTINATION -> ");
            int destinationChoice = sc.nextInt();

            System.out.println("\nENTER TRANSPORTATION -> ");
            int transportChoice = sc.nextInt();

            Traveller traveller = new Traveller(
                    username,
                    age,
                    weight,
                    planets[destinationChoice],
                    earth,
                    transportations[transportChoice]
            );

            screen.generateOutput(traveller);

            System.out.println("\nSimulate another travel ? (y/n)");
            sc.nextLine();
            userReady = sc.nextLine();
        }

        screen.shutdown();

        sc.close();
    }
}