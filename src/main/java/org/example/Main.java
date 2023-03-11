package org.example;

public class Main {
    public enum TriangleType {
        EQUILATERAL, ISOSCELES, SCALENE, NOT_A_TRIANGLE
    }
    public static boolean isTriangle(double side1, double side2, double side3) {
        return side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2;
    }
    public static TriangleType getTriangleType(double side1, double side2, double side3) {
        if (isTriangle(side1, side2, side3)) {
            if (side1 == side2 && side2 == side3) {
                return TriangleType.EQUILATERAL;
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                return TriangleType.ISOSCELES;
            } else {
                return TriangleType.SCALENE;
            }
        } else {
            return TriangleType.NOT_A_TRIANGLE;
        }
    }

    public static void main(String[] args) {

    }
}