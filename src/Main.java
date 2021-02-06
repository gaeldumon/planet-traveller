import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Planet mercury = new Planet("Mercury", 90_000_000L, 3.61, false);
        Planet venus = new Planet("Venus", 42_000_000L, 8.83, false);
        Planet earth = new Planet("Earth", 0, 9.81, false);
        Planet mars = new Planet("Mars", 56_000_000L, 3.75, false);
        Planet jupiter = new Planet("Jupiter", 591_000_000L, 26.0, true);
        Planet saturn = new Planet("Saturn", 1_195_000_000L, 11.2, true);
        Planet uranus = new Planet("Uranus", 2_582_000_000L, 10.5, true);
        Planet neptune = new Planet("Neptune", 4_305_000_000L, 13.3, true);

        Planet[] planets = {mercury, venus, earth, mars, jupiter, saturn, uranus, neptune};

        Screen screen = new Screen();
        screen.launchMenu(planets);

        Scanner sc = new Scanner(System.in);

        System.out.println("\nAre you ready ? (y/n)");
        String userReady = sc.nextLine();

        while (userReady.toLowerCase().equals("y")) {

            screen.askUser();
            // TODO : Put all this in askUser
            System.out.println("\nENTER NAME -> ");
            String username = sc.nextLine();

            System.out.println("\nENTER AGE -> ");
            int age = sc.nextInt();

            System.out.println("\nENTER WEIGHT (in KG) -> ");
            int weight = sc.nextInt();

            System.out.println("\nENTER DESTINATION -> ");
            int destination = sc.nextInt();
            //********************************

            Traveller traveller = new Traveller(username, age, weight, planets[destination], earth);

            screen.generateOutput(traveller);

            System.out.println("\nSimulate another travel ? (y/n)");
            sc.nextLine();
            userReady = sc.nextLine();
        }

        screen.shutdown();

        sc.close();
    }
}