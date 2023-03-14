package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            System.out.println("it's not a triangle");
            return;
        } else if (firstSide + secondSide <= thirdSide || firstSide + thirdSide <= secondSide || secondSide + thirdSide <= firstSide) {
            System.out.println("it's not a triangle");
            return;
        } else if (firstSide == secondSide && secondSide == thirdSide) {
            System.out.println("this is a valid triangle");
            return;
        } else if (firstSide == secondSide || secondSide == thirdSide || firstSide == thirdSide) {
            System.out.println("this is a valid triangle");
            return;
        } else if (firstSide*firstSide == secondSide*secondSide + thirdSide*thirdSide) {
            System.out.println("this is a valid triangle");
            return;
        } else if (secondSide*secondSide == firstSide*firstSide + thirdSide*thirdSide) {
            System.out.println("this is a valid triangle");
            return;
        } else if (thirdSide*thirdSide == firstSide*firstSide + secondSide*secondSide) {
            System.out.println("this is a valid triangle");
            return;
        } else {
            System.out.println("it's not a triangle");
            return;
        }
    }
}
