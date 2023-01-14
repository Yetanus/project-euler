package pe1;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class MultiplierTest {

    @Test
    public void divisionTest10(){
        Multiplier multiplier = new Multiplier();
        multiplier.division(10);
        Integer result = multiplier.setOfValues.stream()
                .mapToInt(Integer::intValue)
                .sum();
        assertEquals(Optional.of(23), Optional.of(result));
    }
    @Test
    public void divisionTest1000(){
        Multiplier multiplier = new Multiplier();
        multiplier.division(1000);
        assertEquals(Optional.of(233168), Optional.ofNullable(multiplier.sumOfValues()));
    }
}
