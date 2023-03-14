package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide*firstSide == secondSide*secondSide + thirdSide*thirdSide) 
        System.out.println("this is a valid triangle"); else
        if (secondSide*secondSide == firstSide*firstSide + thirdSide*thirdSide)
        System.out.println("this is a valid triangle"); else
        if (thirdSide*thirdSide == firstSide*firstSide + secondSide*secondSide)
        System.out.println("this is a valid triangle");
        else System.out.println("it's not triangle");
    }
}
