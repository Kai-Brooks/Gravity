public class GravityCalculator
{
    public static double calculateFinalPosition(double gravity, double initialVelocity, double fallingTime, double initialPosition)
    {
        return 0.5 * gravity * (fallingTime*fallingTime) + initialVelocity * fallingTime + initialPosition;
    }
}