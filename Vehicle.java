/*
* Vehicle Class
*
* @author  Daria Bernice Calitis
* @version 11.0.16
* @since   2022-10-18
*/

/**
 * Vehicle Class.
 */
public class Vehicle {
    /**
     * License Plate.
     */
    private String licensePlate;

    /**
     * Colour of the vehicle.
     */
    private String colour;

    /**
     * Number of doors of the vehicle.
     */
    private int numDoors;

    /**
     * The maximum speed of the vehicle.
     */
    private int maxSpeed;

    /**
     * The current speed of the vehicle.
     */
    private int speed;

    /**
     * Vehicle constructor.
     *
     * @param colour - the colour
     * @param licensePlate - the license Plate
     * @param numDoors - the number of doors
     * @param maxSpeed - the maximum speed of the vehicle
     */
    public Vehicle(
        String colour,
        String licensePlate,
        int numDoors,
        int maxSpeed) {
        this.licensePlate = licensePlate;
        this.colour = colour;
        this.numDoors = numDoors;
        this.maxSpeed = maxSpeed;
    }

    /**
     * The status() function.
     *
     * <p>
     * Shows the status and properties of the vehicle
     * </p>
     */
    public void status() {
        System.out.println(
            String.format("%s\n%s\n%s\n%s\n%s",
                "       --> Speed: " + String.valueOf(this.speed),
                "       --> MaxSpeed: " + String.valueOf(this.maxSpeed),
                "       --> Number of doors: " + String.valueOf(this.numDoors),
                "       --> License Plate: " + this.licensePlate,
                "       --> Color: " + this.colour)
        );
    }

    /**
     * The getLicense() function.
     *
     * @return licensePlate
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * The setLicensePlate() function.
     *
     * @param licensePlate - The license plate
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * The getColor() function.
     *
     * @return colour
     */
    public String getColor() {
        return this.colour;
    }

    /**
     * The setColor() function.
     *
     * @param color - the colour
     */
    public void setColor(String color) {
        this.colour = color;
    }

    /**
     * The getDoors() function.
     *
     * @return numDoors
     */
    public int getDoors() {
        return this.numDoors;
    }

    /**
     * The getSpeed() function.
     *
     * @return speed
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * The accelerate() function.
     *
     * <p>
     * Increases the speed over a period of time.
     * </p>
     *
     * @param accelerationPower - the power
     * @param accelerationTime - the period of time
     */
    public void accelerate(int accelerationPower, int accelerationTime) {
        this.speed = accelerationPower * accelerationTime + this.speed;

        if (this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
        }
    }

    /**
     * The break() function.
     *
     * <p>
     * Decreases the speed over a period of time.
     * </p>
     *
     * @param breakPower - the power
     * @param breakTime - the period of time
     */
    public void breakVehicle(int breakPower, int breakTime) {
        this.speed = this.speed - breakPower * breakTime;

        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
