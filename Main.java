public class Main
{
    
    public static void main(String[] args)
    {
        //It says to define these with the "appropriate values" but I'm not sure what the appropriate values are

        double initialVelocity = 0;
        double fallingTime = 5;
        double initialPosition = 0;

        double finalPosition = GravityCalculator.calculateFinalPosition(-9.8, initialVelocity, fallingTime, initialPosition);

        System.out.println(finalPosition);
    }
}