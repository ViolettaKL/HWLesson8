package org.example;

import org.junit.*;

public class SolverTest {
    Solver solver;

    @Before
    public void setUpEveryTest() {
        solver = new Solver();
    }
    //Ex.6.2
    @Test
    public void discriminantSolverPositive() {
        int result = solver.discriminantSolve(5, 12, 4);
        Assert.assertEquals(2, result);
    }
    @Test
    public void discriminantSolverNegative() {
        int result = solver.discriminantSolve(1, 0, 36);
        Assert.assertEquals(0, result);
    }
    @Test
    public void discriminantSolverZero() {
        int result = solver.discriminantSolve(1, 2, 1);
        Assert.assertEquals(1, result);
    }

}
