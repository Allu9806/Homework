public class TASK_1_MARS {
    static float earthWeightRobin = 85.0f;
    static float marsGravityRateRobin = 0.38f;
    static float marsWeightFloatRobin;
    static double marsWeightDoubleRobin;
    static int marsWeightIntRobin;
    static char marsWeightCharRobin;
    static int finalMathResultRobin;

    public static void main(String[] args) {
        marsWeightFloatRobin = earthWeightRobin * marsGravityRateRobin;
        System.out.println("Initial weight on Earth: " + earthWeightRobin + " kg");
        System.out.println("Calculated weight on Mars (float): " + marsWeightFloatRobin);

        marsWeightDoubleRobin = (double) marsWeightFloatRobin;
        System.out.print("Weight on Mars , limited to 4 decimal places: ");
        System.out.format("%.4f%n", marsWeightDoubleRobin);

        marsWeightIntRobin = (int) marsWeightDoubleRobin;
        System.out.println("Double value cast to int: " + marsWeightIntRobin);

        marsWeightCharRobin = (char) marsWeightIntRobin;
        System.out.println("Int value cast to char: " + marsWeightCharRobin);

        finalMathResultRobin = marsWeightCharRobin + 50;
        System.out.println("Result of adding 50 to the char value, stored as int: " + finalMathResultRobin);
    }
}