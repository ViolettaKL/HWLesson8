package org.example;

public class Solver {

    public int discriminantSolve(int a, int b, int c) {

        int result = 0;
        int d = b * b - 4 * a * c;

        if (d < 0) {
            result = 0;
        } else if (d == 0) {
            result = 1;
        } else if (d > 0) {
            result = 2;
        } else {
            System.out.println("Error solver");
        }
        return result;

    }
}
