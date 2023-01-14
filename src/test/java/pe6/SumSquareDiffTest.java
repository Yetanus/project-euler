package pe6;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SumSquareDiffTest {

    @Test
    public void calculateHowManyNumbersBefore(){
        SumSquareDiff sumSquareDiff = new SumSquareDiff();
        assertEquals(9, sumSquareDiff.calculateHowMany(10));
    }

    @Test
    public void calculateSumOfSquaresofNumber(){
        SumSquareDiff sumSquareDiff = new SumSquareDiff();
        assertEquals(385, sumSquareDiff.calculateSumOfSquares(sumSquareDiff.calculateHowMany(11)));
    }

    @Test
    public void calculateSquareSumofNumber(){
        SumSquareDiff sumSquareDiff = new SumSquareDiff();
        assertEquals(3025, sumSquareDiff.calculateSquareSum(sumSquareDiff.calculateHowMany(11)),0.1);
    }

    @Test
    public void findDiffofNumber(){
        SumSquareDiff sumSquareDiff = new SumSquareDiff();
        assertEquals(2640,sumSquareDiff.findDiff(10));
    }
    @Test
    public void findDiffofNumber100(){
        SumSquareDiff sumSquareDiff = new SumSquareDiff();
        assertEquals(25164150,sumSquareDiff.findDiff(100)); //SOLUTION
    }
}
