package pe7;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertEquals;

public class PrimeTest {
    @ParameterizedTest
    @ValueSource(ints = {2,3,5,7,11,13})
    public void isPrime(){
        assertEquals(true, new Prime().isPrime(3));
    }

    @Test
    public void whichPrimeAmI(){
        assertEquals(13, new Prime().countPrimes(6));
    }
}
