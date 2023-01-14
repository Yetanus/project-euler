package pe2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FiboTest {
    @ParameterizedTest
    @ValueSource(ints = {1,2,10,4000000})
    public void fiboTest(int values){
        Fibo fibo = new Fibo();
        assertNotNull(fibo.count(values));
    }

    @Test
    public void fiboTest4000000(){
        Fibo fibo = new Fibo();
        long sum = fibo.count(4000000);
        assertEquals(4613732, sum);
    }
}
