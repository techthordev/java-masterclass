package br.com.techthordev.section_05.exercises;

public class SpeedConverter {

    /**
     * Converts kilometers per hour to miles per hour.
     *
     * @param kilometersPerHour the speed in kilometers per hour
     * @return rounded miles per hour, or -1 if input is invalid
     */
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    /**
     * Prints the conversion from kilometers per hour to miles per hour.
     *
     * @param kilometersPerHour the speed in kilometers per hour
     */
    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (milesPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
