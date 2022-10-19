/*
* This is the standard Main() class starting point.
*
* @author  Daria Bernice Calitis
* @version 11.0.16
* @since   2022-10-03
*/

/**
 *  Main class.
*/
final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        System.out.println("Created Ford focus");
        final Vehicle fordFocus = new Vehicle("white", "B40-C4RR0", 4, 284);

        System.out.println("Status:");
        fordFocus.status();

        System.out.println("Accelerating, 10 of power for 10 sec.");
        fordFocus.accelerate(10, 10);
        System.out.println(
            "New speed: " + String.valueOf(fordFocus.getSpeed())
        );

        System.out.println("Changing colour to black:");
        fordFocus.setColor("black");
        System.out.println("New color: " + fordFocus.getColor());

        System.out.println();

        // new Ferrari
        System.out.println("Created a Ferrari");
        final Vehicle ferrari = new Vehicle("red", "VHD-35HU", 2, 320);

        System.out.println("Status:");
        ferrari.status();

        System.out.println("Accelerating, 100 of power for 4 sec.");
        ferrari.accelerate(100, 4);
        System.out.println("New speed: " + String.valueOf(ferrari.getSpeed()));

        System.out.println("Breaking, 10 of power for 10 sec.");
        ferrari.breakVehicle(10, 10);
        System.out.println("New speed: " + String.valueOf(ferrari.getSpeed()));

        System.out.println();

        // new Citroen Ami
        System.out.println("Created a Citroen Ami");
        final Vehicle citroenAmi = new Vehicle("blue", "FS-695-DQ", 2, 45);

        System.out.println("Status:");
        citroenAmi.status();

        System.out.println("Accelerating, 5 of power for 10 sec.");
        citroenAmi.accelerate(5, 10);
        System.out.println("New speed: " + String.valueOf(
            citroenAmi.getSpeed())
        );

        System.out.println("Breaking, 2 of power for 10 sec.");
        citroenAmi.breakVehicle(2, 10);
        System.out.println("New speed: " + String.valueOf(
            citroenAmi.getSpeed())
        );

        System.out.println("Changing color:");
        citroenAmi.setColor("purple");
        System.out.println("New color: " + citroenAmi.getColor());

        System.out.println("\nDone.");
    }
}

