package pe1;

import java.util.HashSet;
import java.util.Set;

public class Multiplier {
    Integer sum = 0;
    Set<Integer> setOfValues = new HashSet<>();

    public void division(int number) {
        for (int i = 0; i < number; i++) {
            if (!(i ==0) && i % 3 == 0) {
                setOfValues.add(i);
            }
            if (!(i==0) && i % 5 == 0) {
                setOfValues.add(i);
            }
        }
        System.out.println(setOfValues);
    }
    
    public Integer sumOfValues() {
        sum = setOfValues.stream()
                        .mapToInt(Integer::intValue)
                        .sum();
        System.out.println("Sum of list values "+ sum);
        return sum;
    }

}

